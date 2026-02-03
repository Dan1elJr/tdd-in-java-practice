package com.sandaniel.customservice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.UUID;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.sandaniel.customservice.model.User;
import com.sandaniel.customservice.service.UserService;
import com.sandaniel.customservice.service.UserServiceImpl;


public class UserServiceTest {
	
	UserService userService;
	String id;
	String firstName;
	String lastName;
	String email;
	String password;
	String repeatPassword;
	
	@BeforeEach
	public void init () {
		this.userService = new UserServiceImpl();
		id = UUID.randomUUID().toString();
		firstName = "Daniel";
		lastName = "San";
		email = "danisan@gmail.com";
		password = "123321";
		repeatPassword = "123321";
	}
	
	@DisplayName("User object created")
	@Test
	void testCreateUser_whenUserDetailsProvides_returnsUserObject() {

		// Act	
		User user = userService.createUser(id,firstName,lastName,email);
			
		// Assert
		assertNotNull(user, ()->"The createUser() should not have returned null");
		assertEquals(firstName, user.getFirstName(), ()-> "User's first name is incorrect");
		assertEquals(lastName, user.getLastName(),()->"User's last name is incorrect");
		assertEquals(email, user.getEmail(),()->"User's email is incorrect");
		assertNotNull(user.getId(),()->"User id is missing");
	}
	
	@DisplayName("If firstName is empty")
	@Test
	void testCreateUser_whenFirstNameIsEmpty_throwsIllegalArgumentException() {
	
		// Arrange
		String firstName ="";
		String expecteExceptionMessage = "Users's first name is empty";
		
		// Act & Assert
		IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, ()->{
			userService.createUser(firstName, lastName, email, password, repeatPassword);
		
		},()->"Empty first name should have caused an illegal Argument Exception");
		
		//Assert
		
		assertEquals(expecteExceptionMessage, thrown.getMessage(), ()->"Should return IllegalArgumentException");
		
	}
	
	
	
	
}
