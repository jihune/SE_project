package com.se.kmbss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.se.kmbss.mapper.MainMapper;
import com.se.kmbss.service.MainService;

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

	@GetMapping
	public String index(Model model) {
		return "index";
	}

	@GetMapping("notice_board")
	public String notice_board() {
		return "notice_board";
	}

	@GetMapping("notice_detailpage")
	public String notice_detailpage() {
		return "notice_detailpage";
	}

	@GetMapping("my_boards")
	public String my_boards() {
		return "my_boards";
	}

	@GetMapping("private_board")
	public String private_board() {
		return "private_board";
	}

	@GetMapping("create_study")
	public String create_study() {
		return "create_study";
	}

	@GetMapping("setting")
	public String setting() {
		return "setting";
	}
}