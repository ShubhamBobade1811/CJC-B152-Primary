package com.mian.exception;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ProductNotFoundException.class)
	public ApiError ProductNotFoundExceptionHandler(ProductNotFoundException e, HttpServletRequest s) {

		ApiError error=new ApiError(HttpStatus.NOT_FOUND.value(), e.getMessage(), new Date(), HttpStatus.NOT_FOUND, s.getRequestURI());
		
		return error;
	}
	
	
}
