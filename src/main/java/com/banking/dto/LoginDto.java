package com.banking.dto;
/**
 * LoginDto - In this dto's we can get the values for Login
 * @author Janani.V
 * @created date - 04-12-2019
 */
public class LoginDto {

	private String userName;
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
