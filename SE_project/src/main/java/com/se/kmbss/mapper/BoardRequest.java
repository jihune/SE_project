package com.se.kmbss.mapper;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class BoardRequest {
    private Integer board_idn;
    private Integer user_idn;
    private String board_content;
    private Integer board_location_city;
    private Integer board_location_sigungu;
    private String board_name;
    private Integer board_category;
}
