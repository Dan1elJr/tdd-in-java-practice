package com.sandaniel.customservice.service;

import com.sandaniel.customservice.model.User;

public class UserServiceImpl implements UserService{

	@Override
	public User createUser(String firstName,
						   String lastName,
						   String email,
						   String password,
						   String repeatPassword){
		
		return new User(firstName, lastName, email, password, repeatPassword);
	}

	@Override
	public User createUser(String id, String firstName, String lastName, String email) {
		return new User(id,firstName, lastName, email);
	}

}
