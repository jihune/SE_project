package com.se.kmbss.mapper;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class CommentResponse {
    private Integer commentidn;
    private Integer suidn;
    private Integer boardidn;
    private LocalDateTime commentuploaddate;
    private LocalDateTime commentmodifydate;
    private LocalDateTime commentdeletedate;
    private String commentcontent;
}
