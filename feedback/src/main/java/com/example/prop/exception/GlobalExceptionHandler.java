package com.example.prop.exception;


import org.springframework.stereotype.Component;




@Component
public class GlobalExceptionHandler extends RuntimeException {
	
	
	private static final long serialVersionUID= 1L;
	private String errorcode;
	private String errormessage;
	public String getErrorcode() {
		return errorcode;
	}
	public void setErrorcode(String errorcode) {
		this.errorcode = errorcode;
	}
	public String getErrormessage() {
		return errormessage;
	}
	public void setErrormessage(String errormessage) {
		this.errormessage = errormessage;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public GlobalExceptionHandler(String errorcode, String errormessage) {
		super();
		this.errorcode = errorcode;
		this.errormessage = errormessage;
	}
	public GlobalExceptionHandler() {
		
	}
	
}

