package com.se.kmbss.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class BoardDomain {
    private Integer board_seq;
    private Integer user_seq;
    private String board_upload_date;
    private String board_modify_date;
    private String board_delete_date;
    private String board_content;
    private Integer board_location_city;
    private Integer board_location_sigungu;
    private String board_name;
    private Integer board_category;
}
