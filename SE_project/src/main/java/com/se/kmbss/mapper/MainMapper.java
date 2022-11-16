package com.se.kmbss.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

// 데이터베이스에서 가져올 기능을 정의하는 곳이다.
// src/main/resources/mapper/Mapper.xml에서 쿼리문을 작성한다.
// mapper를 여러개 만들어 운용하고 싶다면 src/main/resources/mapper 에 xml파일을 만들어 작성하면 자동으로 검색된다.

@Mapper
public interface MainMapper {

    List<Integer> getMember();

    String loginRes(String id, String password);

    void save(Map<String, Object> map);

    // List<Integer> getMemberList();

    // int createMember();

    // int updateMember();

    // int deleteMember();
}
