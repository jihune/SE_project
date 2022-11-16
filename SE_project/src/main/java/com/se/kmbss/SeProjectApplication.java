package com.se.kmbss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 프로그램을 시작하면 가장먼저 시작하게 된다.
// 건드릴 일은 거의 없다.

// src/main/resources/ 의 파일구조 설명
// mapper: 각종 쿼리문을 모으는 폴더
// static js, css파일을 모으는 폴더
// template: html파일을 모으는 폴더

@SpringBootApplication
public class SeProjectApplication {
//fafaf
	public static void main(String[] args) {
		SpringApplication.run(SeProjectApplication.class, args);
	}

}
