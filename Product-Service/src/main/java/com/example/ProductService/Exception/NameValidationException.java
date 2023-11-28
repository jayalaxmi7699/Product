package com.example.ProductService.Exception;

public class NameValidationException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	String msg;

	public NameValidationException(String msg) {
		super(msg);
	}
}
