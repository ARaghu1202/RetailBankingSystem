package com.banking.service;

import com.banking.dto.RegisterRequestDto;
import com.banking.dto.RegisterResponseDto;

/**
 * UserService-to register the user
 * @author Janani.V
 *
 */
@FunctionalInterface
public interface UserService {

	public RegisterResponseDto registerUser(RegisterRequestDto userRegisterDto);

}
