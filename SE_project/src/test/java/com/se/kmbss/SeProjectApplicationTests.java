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
		params.setBoard_name("보드 실험 제목");
		params.setBoard_content("보드 실험 내용");
		params.setBoard_location_city(10);
		params.setBoard_location_sigungu(160); 
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
		params.setBoard_name("1번의 제목 바꿈");
		params.setBoard_content("1번의 내용 바꿈");
		params.setBoard_location_city(10);
		params.setBoard_location_sigungu(160);
		params.setBoard_idn(1); 
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
		params.setBoard_name("서비스 테스트 제목");
		params.setBoard_content("서비스 테스트 내용");
		params.setBoard_location_city(10);
		params.setBoard_location_sigungu(160);
		BoardService.uploadBoard(params);
	}
}
