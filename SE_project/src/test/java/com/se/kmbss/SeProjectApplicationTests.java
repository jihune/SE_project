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

@SpringBootTest
class SeProjectApplicationTests {

	@Autowired
	BoardMapper BoardMapper;

	@Test
	void upload() {
		BoardRequest params = new BoardRequest();
		params.setBoard_name("3번의 제목");
		params.setBoard_content("3번의 내용");
		params.setBoard_location_city(10);
		params.setBoard_location_sigungu(160);
		params.setBoard_idn(3); 
		BoardMapper.upload(params);
		
		List<BoardResponse> posts = BoardMapper.find_all();
		System.out.println("전체 게시글 수 : "+posts.size());
	}
	@Test
	void find_by_id(){
		BoardResponse post= BoardMapper.find_by_id(3);
		String postJson;
		try {
			postJson = new ObjectMapper().registerModule(new JavaTimeModule()).writeValueAsString(post);
			System.out.println(postJson);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}	
	}

	@Test
	void modify(){
		BoardRequest params = new BoardRequest();
		params.setBoard_name("3번의 제목 바꿈");
		params.setBoard_content("3번의 내용 바꿈");
		params.setBoard_location_city(10);
		params.setBoard_location_sigungu(160);
		params.setBoard_idn(3); 
		BoardMapper.modify(params);
	}

	@Test
	void delete_by_id(){
		BoardMapper.delete_by_id(3);
	}
}
