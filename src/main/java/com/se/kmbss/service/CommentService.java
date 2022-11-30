package com.se.kmbss.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.se.kmbss.mapper.CommentMapper;
import com.se.kmbss.mapper.CommentRequest;
import com.se.kmbss.mapper.CommentResponse;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CommentService {
    @Autowired
    private final CommentMapper commentMapper;

    @Transactional
    public void uploadcomment(final CommentRequest params){
        commentMapper.uploadcomment(params);
    }

    public List<CommentResponse> find_by_boardidn(int boardidn){
        return commentMapper.find_by_boardidn(boardidn);
   }
}
