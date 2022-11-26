package com.se.kmbss.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.se.kmbss.mapper.MainMapper;
import com.se.kmbss.service.MainService;

import com.se.kmbss.service.BoardService;
import com.se.kmbss.mapper.BoardRequest;
import com.se.kmbss.mapper.BoardResponse;

/**
 * 기본적인 html 페이지를 연결해 주는 곳이다.
 * 추후 Mapper 통해서 쿼리문 사용 DB와 연결
 */

@Controller
public class MainController {

	@Autowired
	BoardService BoardService;
	@Autowired
	MainService service;
	// @Autowired
	// BoardRequest BoardRequest;

	@Autowired
	MainMapper mapper;

	@GetMapping
	public String index(Model model) {
		return "index";
	}

	@GetMapping("notice_board")
	public String notice_board(Model model) {
		List<BoardResponse> posts=BoardService.findAll();
        model.addAttribute("posts", posts);
		System.out.println(posts);
        return "notice_board";
	}

	@GetMapping("write_board")
	public String write_board() {
		return "write_board";
	}

	@PostMapping("write_board")
	public String uploadBoard(final BoardRequest params){
		BoardService.uploadBoard(params);
		return "redirect:notice_board";
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

	@GetMapping("security_question")
	public String security_question(){return "security_question";}

	@GetMapping("password_change")
	public String password_change(){return "password_change";}

	@GetMapping("notice_setting")
	public String notice_setting(){return "notice_setting";}

	@GetMapping("lock_setting")
	public String lock_setting(){return "lock_setting";}

	

	@GetMapping("group_chat")
	public String group_chat() {
		return "group_chat";
	}
	@GetMapping("my_page")
	public String my_page() {
		return "my_page";
	}

	@GetMapping("persenal_location_set")
	public String persenal_location_set() {
		return "persenal_location_set";
	}
}
