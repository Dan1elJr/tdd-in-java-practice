package com.sandaniel.customservice.model.util;

public class UserValidator {
	
	public static void validateUserFirstName(String firstName) {
		if(firstName.isBlank() || firstName == null) {
			throw new IllegalArgumentException("Users's first name is empty");
		}
	}
	
	public static void validateUserLastName(String lastName) {
		if(lastName.isBlank() || lastName == null) {
			throw new IllegalArgumentException("Users's first name is empty");
		}
	}
	
}
