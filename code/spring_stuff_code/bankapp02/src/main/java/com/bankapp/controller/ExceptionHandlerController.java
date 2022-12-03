package com.bankapp.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.bankapp.dto.ErrorInfoDto;
import com.bankapp.exception.BankAccountNotFoundExcetion;

@RestControllerAdvice
public class ExceptionHandlerController {
	
	//AOP @AfterThrows under the hood 
	@ExceptionHandler(BankAccountNotFoundExcetion.class)
	public ResponseEntity<ErrorInfoDto> handle404(BankAccountNotFoundExcetion accountNotFoundExcetion){
		ErrorInfoDto dto=new ErrorInfoDto();
		dto.setError(accountNotFoundExcetion.getMessage());
		dto.setStatus(HttpStatus.NOT_FOUND.toString());
		dto.setTimestamp(LocalDateTime.now());
		dto.setToContact("rgupta.mtech@gmail.com");
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(dto);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorInfoDto> handle500(Exception exception){
		ErrorInfoDto dto=new ErrorInfoDto();
		dto.setError("pls try after some time");
		dto.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.toString());
		dto.setTimestamp(LocalDateTime.now());
		dto.setToContact("rgupta.mtech@gmail.com");
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(dto);
	}

}
