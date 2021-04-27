package com.sales.application.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionControllerAdvice extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(EntityNotFound.class)
	public final ResponseEntity<Object> handleEntityNotFound(EntityNotFound e, WebRequest web) {
	     return new ResponseEntity(e.getLocalizedMessage(), HttpStatus.NOT_FOUND);
	}

}
