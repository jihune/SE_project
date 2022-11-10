package com.se.kmbss.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/")

public class MainController {
    
    /*
    @Autowired
	MainMapper mapper;
    */

    @GetMapping
	public String index(Model model) {
		return "index";
	}

	/**
	 * @return 회원가입 페이지
	 */
	@GetMapping("sign_up")
	public String sign_up() {
		return "sign_up";
	}

    /*
	@PostMapping("sign_up")
	public String sign_up(CustomerDTO customer) {
		System.out.println(customer);
		if(customer.getGeneralCall() == null){
			customer.setGeneralCall("053...01");
		}
		customerService.join(customer);
		return "redirect:/";
	}
    */
}
