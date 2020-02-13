package com.example.demo.exception;

import org.springframework.http.HttpStatus;

public abstract class ApiBaseException extends RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 2160744369649050658L;

	public ApiBaseException(String message) {
        super(message);
    }

    public abstract HttpStatus getStatusCode();
}
