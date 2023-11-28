package com.example.ProductService.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(value = EmailValidationException.class)
	public ResponseEntity<String> handleException(EmailValidationException productexc){
		return new ResponseEntity<String>(productexc.getMessage() , HttpStatus.BAD_REQUEST);
	}		
	
	@ExceptionHandler(value = NameValidationException.class)
	public ResponseEntity<String> handleException(NameValidationException productexc){
		return new ResponseEntity<String>(productexc.getMessage() , HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(value = IdNotFoundException.class)
	public ResponseEntity<String> handleException(IdNotFoundException productexc){
		return new ResponseEntity<String>(productexc.getMessage() , HttpStatus.NOT_FOUND);
	}
}
