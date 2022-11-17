package com.se.kmbss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.se.kmbss.mapper.MainMapper;
import com.se.kmbss.mapper.Notice_boardMapper;
import com.se.kmbss.model.StudyUserVO;
import com.se.kmbss.service.MainService;
import com.se.kmbss.service.StudyUserService;

/**
 * 기본적인 html 페이지를 연결해 주는 곳이다.
 * 추후 Mapper 통해서 쿼리문 사용 DB와 연결
 */

@Controller
public class MainController {

	@Autowired
	MainService service;

	@Autowired
	MainMapper mapper;

    @Autowired
	StudyUserService su_service;

	@Autowired
	Notice_boardMapper nb;

	@GetMapping
	public String index(Model model) {
		return "index";
	}

    @GetMapping("sign_up")
	public String sign_up() {
		return "sign_up";
	}

    @GetMapping("sign_in")
	public String sign_in() {
		return "sign_in";
	}

    @GetMapping("notice_board")
	public String notice_board() {
		return "notice_board";
	}

    @GetMapping("notice_detailpage")
	public String notice_detailpage() {
		return "notice_detailpage";
	}

	@PostMapping("sign_up")
	public String sign_up(StudyUserVO study_user) {
		System.out.println(study_user);
		su_service.signUp(study_user);
		return "redirect:/sign_in";
	}

    @ResponseBody
	@GetMapping("idOverlapCheck")
	public String idOverlapCheck(@RequestParam("su_id") String su_id){
		StudyUserVO study_user = new StudyUserVO();
		study_user.setSu_id(su_id);
		if(su_service.isOverlapId(study_user)){
			return "SUCCESS";
		}
		return "FAIL";
	}

	@ResponseBody
	@GetMapping("nickOverlapCheck")
	public String nickOverlapCheck(@RequestParam("su_nick") String su_nick){
		StudyUserVO study_user = new StudyUserVO();
		study_user.setSu_nick(su_nick);
		if(su_service.isOverlapNick(study_user)){
			return "SUCCESS";
		}
		return "FAIL";
	}

	@ResponseBody
	@GetMapping("emailOverlapCheck")
	public String emailOverlapCheck(@RequestParam("su_email") String su_email){
		StudyUserVO study_user = new StudyUserVO();
		study_user.setSu_email(su_email);
		if(su_service.isOverlapEmail(study_user)){
			return "SUCCESS";
		}
		return "FAIL";
	}
}