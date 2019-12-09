package com.banking.service;

import java.util.List;

import com.banking.dto.ViewPayeeDto;

/**
 * UserAccountService - to get allPayees
 * @author Sachin.A
 *
 */
@FunctionalInterface
public interface UserAccountService {

	public List<ViewPayeeDto> getAllPayees(Integer accountId);

}
