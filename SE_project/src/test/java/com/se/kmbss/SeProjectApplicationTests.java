package com.se.kmbss;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.se.kmbss.mapper.BoardRequest;
import com.se.kmbss.mapper.BoardResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.se.kmbss.mapper.BoardMapper;
import com.se.kmbss.service.BoardService;

@SpringBootTest
class SeProjectApplicationTests {

	@Autowired
	BoardMapper BoardMapper;
	@Autowired
	BoardService BoardService;

	@Test
	void upload() {
		BoardRequest params = new BoardRequest();
		params.setBoardname("보드 실험 제목");
		params.setBoardcontent("보드 실험 내용");
		params.setBoardlocationcity(10);
		params.setBoardlocationsigungu(160); 
		BoardMapper.upload(params);
		
		//List<PostResponse> posts = BoardMapper.find_all();
		//System.out.println("전체 게시글 수 : "+posts.size());
	}
	@Test
	void find_by_id(){
		BoardResponse post= BoardMapper.find_by_id(1);
		System.out.println(post);
	}

	@Test
	void modify(){
		BoardRequest params = new BoardRequest();
		params.setBoardname("1번의 제목 바꿈");
		params.setBoardcontent("1번의 내용 바꿈");
		params.setBoardlocationcity(10);
		params.setBoardlocationsigungu(160);
		params.setBoardidn(1); 
		BoardMapper.modify(params);
	}

	@Test
	void delete_by_id(){
		BoardMapper.delete_by_id(3);
	}

	@Test
	void find_all(){
		List<BoardResponse> post= BoardMapper.find_all();
		System.out.println(post);
	}

	@Test
	void uploadBoard(){
		BoardRequest params = new BoardRequest();
		params.setBoardname("서비스 테스트 제목");
		params.setBoardcontent("서비스 테스트 내용");
		params.setBoardlocationcity(10);
		params.setBoardlocationsigungu(160);
		BoardService.uploadBoard(params);
	}
}
