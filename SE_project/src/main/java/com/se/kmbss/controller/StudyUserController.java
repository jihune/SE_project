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

import com.se.kmbss.model.StudyUserVO;
import com.se.kmbss.service.StudyUserService;

/**
 * StudyUser와 관련된 페이지를 다루는 Controller.
 */

@Controller
public class StudyUserController {

    @Autowired
    StudyUserService su_service;

    // 회원가입 페이지 관련 맵핑 시작
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
    // 회원가입 페이지 관련 맵핑 끝

    // 로그인 관련 맵핑 시작
    @GetMapping("sign_in")
    public String sign_in() {
        return "sign_in";
    }

    @PostMapping("sign_in")
    public String sign_in(StudyUserVO study_user, HttpServletRequest request) {

        if (su_service.signInCheck(study_user)) {
            HttpSession sessoin = request.getSession();
            sessoin.setAttribute("study_user", su_service.signIn(study_user));
            return "redirect:/notice_board";
        }

        else {
            return "redirect:/sign_in";
        }

    }
    // 로그인 관련 맵핑 끝

    // ID 찾기 관련 맵핑 시작
    @GetMapping("find_id")
    public String find_id() {
        return "find_id";
    }

    @PostMapping("find_id")
    public ModelAndView findMyId(StudyUserVO study_user, Model model) {

        System.out.println("id find..");
        String result_Id = su_service.findMyId(study_user);

        if (result_Id.equals(null) | result_Id.equals("")) {
            result_Id = "존재하지 않는 계정입니다.";
        }

        ModelAndView mav = new ModelAndView();

        mav.setViewName("find_id_result");
        mav.addObject("result_Id", result_Id);

        model.addAttribute("result_Id", result_Id);

        return mav;
    }
    // ID 찾기 관련 맵핑 끝

    // PW 찾기 관련 맵핑 시작
    @GetMapping("find_pw")
    public String find_pw() {
        return "find_pw";
    }

    @PostMapping("find_pw")
    public String findMyPw(StudyUserVO study_user) {

        if (su_service.findMyPw(study_user)) {
            // su_service.chageMypw(study_user);
            // System.out.println("update pw..");
            return "redirect:/sign_in";
        }

        else {
            return "redirect:/find_pw";
        }

    }
    // PW 찾기 관련 맵핑 끝

}
