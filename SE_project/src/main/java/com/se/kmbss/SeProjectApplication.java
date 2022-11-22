package com.se.kmbss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 프로그램을 시작하면 가장먼저 시작하게 된다.
// 건드릴 일은 거의 없다.

// src/main/resources/ 의 파일구조 설명
// mapper: 각종 쿼리문을 모으는 폴더
// static js, css파일을 모으는 폴더
// template: html파일을 모으는 폴더

// !! 중요 !!
// 작업 환경이 달라졌을 경우 (처음 프로젝트 다운로드 받은 경우)
// DB접속을 위해  SE_project/src/main/resources/application.properties 파일 반드시 수정 후 실행
// 수정 방법은 해당 파일의 주석 참고

@SpringBootApplication
public class SeProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeProjectApplication.class, args);
	}

}
