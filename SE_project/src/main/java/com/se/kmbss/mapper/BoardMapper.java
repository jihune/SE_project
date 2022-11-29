package com.se.kmbss.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import net.bytebuddy.asm.Advice.Return;

// 데이터베이스에서 가져올 기능을 정의하는 곳이다.
// src/main/resources/mapper/mapper.xml에서 쿼리문을 작성한다.
// mapper를 여러개 만들어 운용하고 싶다면 src/main/resources/mapper 에 xml파일을 만들어 작성하면 자동으로 검색된다.

@Mapper
public interface BoardMapper {
  
  void upload(BoardRequest params);

  BoardResponse find_by_id(int board_idn);

  void modify(BoardRequest params);

  void delete_by_id(int user_idn);

  List<BoardResponse>find_all(BoardPaging params);

  void uploadviewcnt(int boardidn);

  int count();
}
