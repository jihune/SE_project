package com.se.kmbss.domain;

import java.util.*;
import java.io.*;
import lombok.Data;



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


    public BoardDomain(int board_seq,int user_seq,String board_upload_date, String board_modify_date, String board_delete_date,
    String board_content, int board_location_city, int board_location_sigungu, String board_name, int board_category){
        this.board_seq=board_seq;
        this.user_seq=user_seq;
        this.board_upload_date=board_upload_date;
        this.board_modify_date=board_modify_date;
        this.board_delete_date=board_delete_date;
        this.board_content=board_content;
        this.board_location_city=board_location_city;
        this.board_location_sigungu=board_location_sigungu;
        this.board_name=board_name;
        this.board_category=board_category;
    }

    public BoardDomain(){}

    public int get_board_seq(){
        return board_seq;
    }
    public void set_board_seq(int seq){
        this.board_seq=seq;
    }
    public int get_user_seq(){
        return user_seq;
    }
    public void set_user_seq(int seq){
        this.user_seq=seq;
    }
    public String get_board_upload_date(){
        return board_upload_date;
    }
    public void set_board_upload_date(String date){
        this.board_upload_date=date;
    }
    public String get_board_modify_date(){
        return board_modify_date;
    }
    public void set_board_modify_date(String date){
        this.board_modify_date=date;
    }
    public String get_board_delete_date(){
        return board_delete_date;
    }
    public void set_board_delete_date(String date){
        this.board_delete_date=date;
    }
    public String get_board_content(){
        return board_content;
    }
    public void set_board_content(String content){
        this.board_content=content;
    }
    public int get_board_location_city(){
        return board_location_city;
    }
    public void set_board_location_city(int city){
        this.board_location_city=city;
    }
    public int get_board_location_sigungu(){
        return board_location_sigungu;
    }
    public void set_board_location_sigungu(int sigungu){
        this.board_location_sigungu=sigungu;
    }
    public String get_board_name(){
        return board_name;
    }
    public void set_board_name(String name){
        this.board_name=name;
    }
    public int get_board_category(){
        return board_category;
    }
    public void set_board_category(int category){
        this.board_category=category;
    }
}
