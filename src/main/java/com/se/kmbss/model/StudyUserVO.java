package com.se.kmbss.model;

import java.sql.Date;
// import java.text.ParseException;
// import java.text.SimpleDateFormat;

import lombok.Data; 

@Data
public class StudyUserVO {

    // 각 변수 앞의 su == StudyUser 줄인 것

    private int su_idn;                // 식별자(유저 고유번호)
    private int su_sign_type;          // 이메일 가입시 0, 구글 1, 네이버 2, 카카오 3
    private String su_id;              // 아이디
    private String su_pw;              // 비밀번호
    private String su_nick;            // 별명
    private String su_name;            // 이름(본명)
    private String su_phone_number;    // 휴대전화 번호
    private String su_email;           // 이메일
    private Date su_birth;             // 생년월일
    
    /**
     * 추가할 지 고민되는 것
     * 
     * private Date joinDate; 가입날짜
     * 
    // 
    
    /**
     * su_birth 생년월일은 별도의 함수로 Set 할 예정
     * 
     * 아래는 추후 사용할 수도 있는 setBirth 함수
     * 
    //
    public void setBirth(String date) {

        if (date.equals("")) {
            this.su_birth = null;
            return;
        }

        java.util.Date date2 = null;
        try {
            date2 = new SimpleDateFormat("yyyy-MM-dd").parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.su_birth = new java.sql.Date(date2.getTime());
    }
     */
}
