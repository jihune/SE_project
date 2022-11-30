package com.se.kmbss.mapper;

import lombok.Data;

@Data
public class BoardPaging {
    private int page;             // 현재 페이지 번호
    private int recordSize;       // 페이지당 출력할 데이터 개수
    private int pageSize;         // 화면 하단에 출력할 페이지 사이즈
    private String keyWord=null;       // 검색 키워드
    private int count;            // 게시글 개수
    private int pagenum;          // 페이지 개수
    private String boardlocationcity=null;
    private String boardlocationsigungu=null;
    private int boardcategory=0;    // 검색 유형

    public BoardPaging() {
        this.page = 1;
        this.recordSize = 10;
        this.pageSize = 10;
    }

    public int pagenumsize(){
        int num=count/recordSize;
        int num2=count%recordSize;
        if(num2!=0)
            num++;

        return num;
    }
   
    public int getOffsetEnd(){
       return this.getOffset()+this.recordSize-1;
        // return count-((page-1)*recordSize);
    }
    public int getOffset() {
       return ((page - 1) * recordSize)+1;
    //    return this.getOffsetEnd()-recordSize;
    }
}
