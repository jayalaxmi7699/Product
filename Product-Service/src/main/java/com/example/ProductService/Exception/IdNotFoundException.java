package com.example.ProductService.Exception;

public class IdNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	String msg;

	public IdNotFoundException(String msg) {
		super(msg);
	}
}
