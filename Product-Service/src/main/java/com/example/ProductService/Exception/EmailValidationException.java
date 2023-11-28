package com.example.ProductService.Exception;

public class EmailValidationException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	String msg;
	
	public EmailValidationException(String msg) {
		super(msg);
	}

}
