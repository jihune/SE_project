package com.se.kmbss.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.se.kmbss.model.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO{
    @Autowired
    private SqlSession sqlSession;

    // 게시글 작성
    @Override
    public void write(BoardVO boardVO) throws Exception{
        sqlSession.insert("boardMapper.insert",boardVO);
    }

    // 게시물 목록 조회
    @Override
    public List<BoardVO> list() throws Exception{
        return sqlSession.selectList("boardMapper.list");
    }
}
