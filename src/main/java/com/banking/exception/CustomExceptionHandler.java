package com.banking.exception;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.banking.constant.ApplicationConstants;
import com.banking.dto.ResponseDto;

import javassist.NotFoundException;

/**
 * CustomExceptionHandler - we are handled here the global exceptions concepts
 * 
 * @author Govindasamy.C
 * @version V1.1
 * @created date - 04-12-2019
 */
@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

	/**
	 * handleMethodArgumentNotValid error handle for @Valid
	 */
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {

		Map<String, Object> body = new LinkedHashMap<>();
		body.put("timestamp", new Date());
		body.put("status", status.value());

		// Get all errors for field valid
		List<String> errors = ex.getBindingResult().getFieldErrors().stream().map(x -> x.getDefaultMessage())
				.collect(Collectors.toList());

		body.put("errors", errors);
		return new ResponseEntity<>(body, headers, status);
	}

	@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<ResponseDto> handleNoRecordFoundException(NotFoundException ex) {
		ResponseDto fundTransferResponseDto = new ResponseDto();
		fundTransferResponseDto.setMessage(ex.getMessage());
		fundTransferResponseDto.setStatus(ApplicationConstants.FAILURE);
		fundTransferResponseDto.setStatusCode(HttpStatus.NOT_FOUND.value());
		return new ResponseEntity<>(fundTransferResponseDto, HttpStatus.NOT_FOUND);
	}
}
