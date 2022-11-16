package com.se.kmbss.model;
import java.util.Date;

import lombok.Data;

@Data
public class ReplyVO {
    private int bno;    //게시물 번호 : 게시물 구분에 사용
	private int rno;    //댓글 번호 : 댓글 구분에 사용
	private String content; // 작성 내용
	private String writer;  // 작성자
	private Date regdate;   // 작성일자
	
	
	@Override
	public String toString() {
		return "ReplyVO [bno=" + bno + ", rno=" + rno + ", content=" + content + ", writer=" + writer + ", regdate="
				+ regdate + "]";
	}
}
