package com.sandaniel.customservice.service;

import com.sandaniel.customservice.data.UserRepository;
import com.sandaniel.customservice.model.User;
import com.sandaniel.customservice.model.util.UserValidator;

public class UserServiceImpl implements UserService{
	
	private UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	

	@Override
	public User createUser(String firstName,
						   String lastName,
						   String email,
						   String password,
						   String repeatPassword){
		
		
		UserValidator.validateUserFirstName(firstName);
		UserValidator.validateUserFirstName(lastName);
		User user =  new User(firstName, lastName, email, password, repeatPassword);
		
		boolean isUserCreated; 
		
		try {
			isUserCreated = userRepository.save(user);
		}
		catch(RuntimeException exc) {
			throw new UserServiceException(exc.getMessage());
		}
		if(!isUserCreated) throw new UserServiceException("Could not create user");
		
		return user;
	}

	@Override
	public User createUser(String id, String firstName, String lastName, String email) {
		UserValidator.validateUserFirstName(firstName);
		UserValidator.validateUserFirstName(lastName);
		
		User user =  new User(id, firstName, email, lastName, email);
		boolean isUserCreated = userRepository.save(user);
		
		if(!isUserCreated) throw new UserServiceException("Could not create user");
		return new User(id,firstName, lastName, email);
	}

}
