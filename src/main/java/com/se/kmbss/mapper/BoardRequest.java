package com.se.kmbss.mapper;

import lombok.Data;

@Data
public class BoardRequest {
    private Integer boardidn;
    private Integer suidn;
    private String boardcontent;
    private String boardlocationcity;
    private String boardlocationsigungu;
    private String boardname;
    private Integer boardcategory;
}
