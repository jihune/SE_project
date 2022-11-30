package com.se.kmbss.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommentMapper {
    void uploadcomment(CommentRequest params);

    List<CommentResponse>find_by_boardidn(int boardidn);
}
