package com.example.controller.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Given Id Base Record Is Not There")
public class RecordNotFoundExceptions extends RuntimeException {
    String msg;
	public RecordNotFoundExceptions() {
		super();
	}
	public RecordNotFoundExceptions(String msg) {
		super();
		this.msg=msg;
	}
	

}
