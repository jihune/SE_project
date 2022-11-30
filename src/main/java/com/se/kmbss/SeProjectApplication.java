package com.se.kmbss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

// 프로그램을 시작하면 가장먼저 시작하게 된다.
// 건드릴 일은 거의 없다.

// src/main/resources/ 의 파일구조
// mapper: 각종 쿼리문을 모으는 폴더
// static: js, css파일을 모으는 폴더
// template: html파일을 모으는 폴더

// DB접속 IO오류 발생 시
// SE_project/src/main/resources/application.properties 파일 속 Oracle Cloud DB 전자지갑 경로수정

// localhost 환경에서는 정상이지만
// 배포환경에서 이미지가 깨지거나, html파일로 이동 못해서 (type=Internal Server Error, status=500) 발생 시
// 파일명의 대소문자를 배포 환경에서 구분 못하는 경우가 원인일 때가 종종 있다.
// EX: [(.PNG, .png), (Message.html, message.html)]

@SpringBootApplication
public class SeProjectApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SeProjectApplication.class, args);
	}

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return super.configure(builder);
    }

}
