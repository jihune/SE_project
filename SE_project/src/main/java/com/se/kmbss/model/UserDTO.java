package com.se.kmbss.model;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import lombok.Data; 

@Data
public class UserDTO {
    private int seq;                // 식별자(유저 고유번호)
    private int sign_type;          // 이메일 가입시 0, 구글 1, 네이버 2, 카카오 3
    private String id;              // 아이디
    private String password;        // 비밀번호
    private String nick;            // 별명
    private String name;            // 이름(본명)
    private String phone_number;    // 휴대전화 번호
    private String email;           // 이메일
    private Date birth;             // 생년월일
    
    // 추가할 지 고민되는 것
    
    // private Date joinDate; 가입날짜

    // 생년월일은 별도의 함수로 Set
    public void setBirth(String date) {

        if (date.equals("")) {
            this.birth = null;
            return;
        }

        java.util.Date date2 = null;
        try {
            date2 = new SimpleDateFormat("yyyy-MM-dd").parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.birth = new java.sql.Date(date2.getTime());
    }
}
