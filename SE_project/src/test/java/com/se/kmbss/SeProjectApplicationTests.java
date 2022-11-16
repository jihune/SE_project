package com.se.kmbss;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//import com.se.kmbss.domain.BoardDomain;
import com.se.kmbss.mapper.Notice_boardMapper;

@SpringBootTest
class SeProjectApplicationTests {
	@Autowired
	Notice_boardMapper nb;
	@Test
	void contextLoads() {

		//System.out.println("result : "+nb.board());
		
	}


}
