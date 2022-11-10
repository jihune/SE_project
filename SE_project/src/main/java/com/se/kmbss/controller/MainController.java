package com.se.kmbss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// 각 html 페이지를 연결해 주는 곳이다.
// 추후 사용자가 사용하는 페이지를 다루는 UserController 추가예정
// 정말 간단한 것만 구현되어 있고 추후 Mapper와 연결해야 함

@Controller
public class MainController {

    @RequestMapping(value = "/home")
    public String home(){

        return "index.html";
    }

	@RequestMapping(value = "/sign_up")
    public String sign_up(){

        return "sign_up.html";
    }

	@RequestMapping(value = "/sign_in")
    public String login(){

        return "sign_in.html";
    }

}