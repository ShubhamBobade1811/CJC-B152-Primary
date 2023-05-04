package com.mian.base_response;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BaseResponse<T> {
	
	private int status;
	private Date date=new Date();
	private String msg;
	private T body;
	
}
