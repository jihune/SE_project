package com.se.kmbss.mapper;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class CommentRequest {
    private Integer commentidn;
    private Integer suidn;
    private Integer boardidn;
    private LocalDateTime commentuploaddate;
    private String commentcontent;
}
