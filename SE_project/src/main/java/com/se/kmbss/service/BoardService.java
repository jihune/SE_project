package com.se.kmbss.service;

import java.util.List;

// import java.util.List;

import com.se.kmbss.model.BoardVO;

public interface BoardService{
    //게시글 작성
    public void write(BoardVO boardVO) throws Exception;

    // 게시물 목록 조회
    public List<BoardVO> list() throws Exception;
}



// import org.springframework.stereotype.Service;

// import com.se.kmbss.domain.BoardDomain;
// import com.se.kmbss.mapper.Notice_boardMapper;

// // 데이터베이스에서 가져온 데이터를 가공하는 곳이다.
// // 이곳에선 바로 클래스를 만들지만, 팀워크를 위해 인터페이스를 만들어 설계도를 먼저 만들고 상속받은 다음 구현하는 것을 추천한다.

// @Service
// public class Board_service {
//     private Notice_boardMapper m;
    
//    // public List<BoardDomain> getBoard(){
//   //      return m.getBoard();
//    // }
// }
