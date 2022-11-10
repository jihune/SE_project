package com.se.kmbss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

	@RequestMapping(value = "/login")
    public String login(){

        return "login.html";
    }

}