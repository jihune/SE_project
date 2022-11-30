package com.se.kmbss.model;

import lombok.Data;

@Data
public class Message {
	String message = "";
	String href = "";
	
	public Message(String message, String href) {
		this.message = message;
		this.href = href;
	}
}