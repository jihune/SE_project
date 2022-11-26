package com.se.kmbss.mapper;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data

public class BoardRequest {
    private Integer boardidn;
    private Integer suidn;
    private String boardcontent;
    private Integer boardlocationcity;
    private Integer boardlocationsigungu;
    private String boardname;
    private Integer boardcategory;
}
