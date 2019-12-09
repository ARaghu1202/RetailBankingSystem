package com.banking.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.banking.constant.ApplicationConstants;
import com.banking.dto.LoginDto;
import com.banking.dto.LoginResponseDto;
import com.banking.service.LoginService;

@RunWith(SpringJUnit4ClassRunner.class)
public class LoginControllerTest {

	@InjectMocks
	LoginController loginController;

	@Mock
	LoginService loginService;

	LoginDto loginDto = new LoginDto();

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);

		loginDto.setUserName("8675958381");
		loginDto.setPassword("start@123");
	}

	@Test
	public void testLogin() {
		LoginResponseDto loginResponseDto = new LoginResponseDto();
		loginResponseDto.setStatus(ApplicationConstants.SUCCESS);
		loginResponseDto.setMessage(ApplicationConstants.LOGIN_SUCCESS_MESSAGE);
		loginResponseDto.setAccountId(1);
		loginResponseDto.setAccountNumber(87873287323L);
		loginResponseDto.setAccountType(ApplicationConstants.ACCOUNT_TYPE);

		when(loginService.login(loginDto)).thenReturn(loginResponseDto);

		ResponseEntity<LoginResponseDto> response = loginController.login(loginDto);
		assertEquals(ApplicationConstants.SUCCESS, response.getBody().getStatus());
		assertEquals(HttpStatus.OK.value(), response.getBody().getStatusCode());
		assertEquals(ApplicationConstants.LOGIN_SUCCESS_MESSAGE, response.getBody().getMessage());
		assertEquals(1, response.getBody().getAccountId());
		assertEquals(87873287323L, response.getBody().getAccountNumber());
		assertEquals(ApplicationConstants.ACCOUNT_TYPE, response.getBody().getAccountType());

	}

	@Test
	public void testLoginForFailure() {
		LoginResponseDto loginResponseDto = new LoginResponseDto();
		loginResponseDto.setStatus(ApplicationConstants.FAILURE);
		loginResponseDto.setMessage(ApplicationConstants.LOGIN_ERROR_MESSAGE);

		loginDto.setUserName("5555333333");
		when(loginService.login(loginDto)).thenReturn(loginResponseDto);

		ResponseEntity<LoginResponseDto> response = loginController.login(loginDto);
		assertEquals(ApplicationConstants.FAILURE, response.getBody().getStatus());
	}

}
