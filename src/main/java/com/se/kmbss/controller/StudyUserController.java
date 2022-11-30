package com.se.kmbss.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.se.kmbss.model.Message;
import com.se.kmbss.model.StudyUserVO;
import com.se.kmbss.service.StudyUserService;

/**
 * StudyUser와 관련된 페이지를 다루는 Controller.
 */

@Controller
public class StudyUserController {

    @Autowired
    StudyUserService su_service;

    // 회원가입 페이지 코드 Start
    @GetMapping("sign_up")
    public String sign_up() {
        return "sign_up";
    }

    @PostMapping("sign_up")
    public String sign_up(StudyUserVO study_user) {
        su_service.signUp(study_user);
        return "redirect:/sign_in";
    }

    @ResponseBody
    @GetMapping("idOverlapCheck")
    public String idOverlapCheck(@RequestParam("su_id") String su_id) {

        StudyUserVO study_user = new StudyUserVO();
        study_user.setSu_id(su_id);

        if (su_service.isOverlapId(study_user)) {
            return "SUCCESS";
        }

        return "FAIL";
    }

    @ResponseBody
    @GetMapping("nickOverlapCheck")
    public String nickOverlapCheck(@RequestParam("su_nick") String su_nick) {

        StudyUserVO study_user = new StudyUserVO();
        study_user.setSu_nick(su_nick);

        if (su_service.isOverlapNick(study_user)) {
            return "SUCCESS";
        }

        return "FAIL";
    }

    @ResponseBody
    @GetMapping("phoneNumberOverlapCheck")
    public String phoneNumberOverlapCheck(@RequestParam("su_phone_number") String su_phone_number) {

        StudyUserVO study_user = new StudyUserVO();
        study_user.setSu_phone_number(su_phone_number);

        if (su_service.isOverlapPhoneNumber(study_user)) {
            return "SUCCESS";
        }

        return "FAIL";
    }

    @ResponseBody
    @GetMapping("emailOverlapCheck")
    public String emailOverlapCheck(@RequestParam("su_email") String su_email) {

        StudyUserVO study_user = new StudyUserVO();
        study_user.setSu_email(su_email);

        if (su_service.isOverlapEmail(study_user)) {
            return "SUCCESS";
        }

        return "FAIL";
    }
    // 회원가입 페이지 관련 코드 End

    // 로그인 관련 코드 Start
    @GetMapping("sign_in")
    public String sign_in() {
        return "sign_in";
    }

    @PostMapping("sign_in")
    public ModelAndView sign_in(StudyUserVO study_user, HttpServletRequest request, Model model) {

        ModelAndView mav = new ModelAndView();

        // 입력정보 DB 등록된 계정과 비교
        if (su_service.signInCheck(study_user)) {
            
            // 등록된 계정 정보로 세션 생성
            HttpSession sessoin = request.getSession();
            sessoin.setAttribute("study_user", su_service.signIn(study_user));

            mav.addObject("data", new Message("로그인 성공", "notice_board"));
	        mav.setViewName("message");
        }

        else {
            mav.addObject("data", new Message("로그인 실패", "sign_in"));
	        mav.setViewName("message");
        }

        return mav;
    }
    // 로그인 관련 코드 End

    // ID 찾기 관련 코드 Start
    @GetMapping("find_id")
    public String find_id() {
        return "find_id";
    }

    @PostMapping("find_id")
    public ModelAndView findMyId(StudyUserVO study_user, Model model) {

        String result_id = su_service.findMyId(study_user);

        if ((result_id == null) || (result_id =="") || (result_id == "0")) {
            result_id = "입력정보와 완벽히 일치하는 계정이 없습니다.";
        }

        ModelAndView mav = new ModelAndView();

        mav.setViewName("find_id_result");
        
        mav.addObject("result_id", result_id);
        model.addAttribute("result_id", result_id);

        return mav;
    }
    // ID 찾기 관련 코드 End

    // PW 찾기 관련 코드 Start
    @GetMapping("find_pw")
    public String find_pw() {
        return "find_pw";
    }

    @PostMapping("find_pw")
    public ModelAndView findMyPw(StudyUserVO study_user, Model model) {

        String result_pw = su_service.findMyPw(study_user);

        if ((result_pw == null) || (result_pw =="") || (result_pw == "0")) {
            result_pw = "입력정보와 완벽히 일치하는 계정이 없습니다.";
        }

        ModelAndView mav = new ModelAndView();

        mav.setViewName("find_pw_result");
        
        mav.addObject("result_pw", result_pw);
        model.addAttribute("result_pw", result_pw);

        return mav;
    }
    // PW 찾기 관련 코드 End

}
