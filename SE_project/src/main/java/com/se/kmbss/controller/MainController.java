package com.se.kmbss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.se.kmbss.mapper.MainMapper;
import com.se.kmbss.mapper.Notice_boardMapper;
import com.se.kmbss.service.MainService;

// 각 html 페이지를 연결해 주는 곳이다.
// 사용자가 사용하는 페이지를 다루는 UserController 추가예정
// 추후 Mapper와 작성해서 DB와 연결

// 현재는 간단한 링크 이동만 가능, 뒤로가기나 여러 페이지로 연결 등 html 완성되면 매끄럽게 다듬어야 함
// 재성이 필요할 경우, 아래 home 함수 복사해서 이름 3개만 바꿔서 html 연결하셈

@Controller
public class MainController {

	@Autowired
	MainService service;

	@Autowired
	MainMapper mapper;

    @Autowired
    Notice_boardMapper nb;
    
    @RequestMapping(value = "/home")
    public String home(/*Model model*/) { 
        //model.addAttribute("board",nb.board());
        return "index"; // html 소스
    }

    @RequestMapping(value = "/sign_up")
    public String sign_up() {

        return "sign_up";
    }

    @RequestMapping(value = "/sign_in")
    public String sign_in() {

        return "sign_in";
    }

    @RequestMapping(value = "/notice_board")
    public String notice_board() {

        return "notice_board";
    }
    @RequestMapping(value = "/notice_detailpage")
    public String notice_detailpage() {

        return "notice_detailpage";
    }
}