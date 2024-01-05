package com.example.firstboot.model.dto;

import lombok.Data;

@Data
public class Member {
	private String userId;
	private String password;
	private String userName;
	private int age;
	private String email;
	private String phone;
	
}
