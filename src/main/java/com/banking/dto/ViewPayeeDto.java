package com.banking.dto;

/**
 *  ViewPayeeDto - In this dto's we can get the values for get all payees
 * 
 * @author Govindasamy.C
 *
 */
public class ViewPayeeDto {

	private Integer accountId;
	private Long accountNumber;
	private String payeeName;

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

	public String getPayeeName() {
		return payeeName;
	}

	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}
}
