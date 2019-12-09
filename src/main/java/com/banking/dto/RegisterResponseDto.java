package com.banking.dto;
/**
 * LoginDto - In this dto's we can get the values for Register
 * @author Janani.V
 * @created date - 04-12-2019
 */
public class RegisterResponseDto extends ResponseDto{

	private String userId;
	private String password;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
