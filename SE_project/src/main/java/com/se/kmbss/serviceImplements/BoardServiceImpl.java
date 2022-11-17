package com.se.kmbss.serviceImplements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.se.kmbss.dao.BoardDAO;
import com.se.kmbss.model.BoardVO;
import com.se.kmbss.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService{
    @Autowired
    private BoardDAO dao;

    //게시글 작성
    @Override
    public void write(BoardVO boardVO) throws Exception{
        dao.write(boardVO);
    }

    //게시물 목록 조회
    @Override
    public List<BoardVO> list() throws Exception{
        return dao.list();
    }

}
