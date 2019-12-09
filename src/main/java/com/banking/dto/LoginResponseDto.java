package com.banking.dto;
/**
 * LoginDto - In this dto's we can get the values for Login
 * @author Janani.V
 * @created date - 04-12-2019
 */
public class LoginResponseDto extends ResponseDto{

	private Integer accountId;
	private Long accountNumber;
	private String accountType;

	private String userName;

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
