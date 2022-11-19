package com.se.kmbss.mapper;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
@Data
public class BoardResponse {
    private Integer board_idn;
    private Integer user_idn;
    private LocalDateTime board_upload_date;
    private LocalDateTime board_modify_date;
    private LocalDateTime board_delete_date;
    private String board_content;
    private Integer board_location_city;
    private Integer board_location_sigungu;
    private String board_name;
    private Integer board_category;
}
