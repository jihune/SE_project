package com.se.kmbss.service;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.se.kmbss.mapper.BoardMapper;
import com.se.kmbss.mapper.BoardRequest;
import com.se.kmbss.mapper.BoardResponse;

import javax.transaction.Transactional;
import java.util.List;


// 데이터베이스에서 가져온 데이터를 가공하는 곳이다.
// 이곳에선 바로 클래스를 만들지만, 팀워크를 위해 인터페이스를 만들어 설계도를 먼저 만들고 상속받은 다음 구현하는 것을 추천한다.

@Service
@RequiredArgsConstructor
public class BoardService {
     @Autowired
     private final BoardMapper BoardMapper;
    
   @Transactional
   public void uploadBoard(final BoardRequest params){
        BoardMapper.upload(params);
   }

   public void uploadviewcnt(int boardidn){
          BoardMapper.uploadviewcnt(boardidn);
   }

   public BoardResponse find_by_id(final int board_idn){
        return BoardMapper.find_by_id(board_idn);
   }

   @Transactional
   public int modifyBoard(final BoardRequest params){
        BoardMapper.modify(params);
        return params.getBoardidn();
   }

   public int deleteBoard(final int idn){
        BoardMapper.delete_by_id(idn);
        return idn;
   }

   public List<BoardResponse> findAll(){
        return BoardMapper.find_all();
   }
}
