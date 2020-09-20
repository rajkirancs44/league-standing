package com.ps.challenge.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class MessageException extends RuntimeException {

	public MessageException(String message) {
		super(message);
	}

	
	
}
