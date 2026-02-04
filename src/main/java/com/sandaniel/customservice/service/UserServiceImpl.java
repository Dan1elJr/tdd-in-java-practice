package com.sandaniel.customservice.service;

import com.sandaniel.customservice.model.User;
import com.sandaniel.customservice.model.util.UserValidator;

public class UserServiceImpl implements UserService{

	@Override
	public User createUser(String firstName,
						   String lastName,
						   String email,
						   String password,
						   String repeatPassword){
		
		
		UserValidator.validateUserFirstName(firstName);
		UserValidator.validateUserFirstName(lastName);
		return new User(firstName, lastName, email, password, repeatPassword);
	}

	@Override
	public User createUser(String id, String firstName, String lastName, String email) {
		return new User(id,firstName, lastName, email);
	}

}
