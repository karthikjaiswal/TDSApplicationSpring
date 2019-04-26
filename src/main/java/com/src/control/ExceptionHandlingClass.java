package com.src.control;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.src.exception.UserNotFoundException;
import com.src.model.ErrorData;

@ControllerAdvice
@RestController
public class ExceptionHandlingClass extends  ResponseEntityExceptionHandler{

	@ExceptionHandler(value = UserNotFoundException.class)
	 public final ResponseEntity<ErrorData> handleNotFoundException(UserNotFoundException ex, WebRequest request) 
	{
		ErrorData errorData = new ErrorData(new Date(), ex.getMessage(),request.getDescription(false));
		    return new ResponseEntity<>(errorData, HttpStatus.NOT_FOUND);
	}
}


