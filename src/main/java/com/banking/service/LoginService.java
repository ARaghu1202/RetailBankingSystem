package com.banking.service;

import com.banking.dto.LoginDto;
import com.banking.dto.LoginResponseDto;

/**
 * LoginService - it has login method
 * @author Janani.V
 *
 */
@FunctionalInterface
public interface LoginService {

	public LoginResponseDto login(LoginDto userLoginDto);

}
