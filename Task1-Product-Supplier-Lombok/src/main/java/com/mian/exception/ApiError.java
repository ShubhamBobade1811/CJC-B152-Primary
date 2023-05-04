package com.mian.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class ApiError {
	
	private int statusCode;
	private String message;
	private Date date;
	private HttpStatus httpStatus;
	private String urlpath;

}
