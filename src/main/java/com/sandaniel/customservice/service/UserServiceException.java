package com.sandaniel.customservice.service;

public class UserServiceException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public UserServiceException(String message) {
		super(message);
	}

}
