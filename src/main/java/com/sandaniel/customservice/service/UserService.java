package com.sandaniel.customservice.service;

import com.sandaniel.customservice.model.User;

public interface UserService {


	User createUser(String firstName, 
			String lastName, 
			String email, 
			String password, 
			String repeatPassword);
	
	User createUser(String id,
			String firstName, 
			String lastName, 
			String email);
}
