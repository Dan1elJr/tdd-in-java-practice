package com.sandaniel.customservice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.UUID;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.sandaniel.customservice.model.User;
import com.sandaniel.customservice.service.UserService;
import com.sandaniel.customservice.service.UserServiceImpl;


public class UserServiceTest {
	
	@DisplayName("User object created")
	@Test
	void testCreateUser_whenUserDetailsProvides_returnsUserObject() {
		
		// Arrange
		UserService userUservice = new UserServiceImpl();
		String id = UUID.randomUUID().toString();
		String firstName = "Daniel";
		String lastName = "San";
		String email = "danisan@gmail.com";
		String password = "123321";
		String repeatPassword = "123321";
			
		// Act	
		User user = userUservice.createUser(id,firstName,lastName,email);
			
		// Assert
		assertNotNull(user, ()->"The createUser() should not have returned null");
		assertEquals(firstName, user.getFirstName(), ()-> "User's first name is incorrect");
		assertEquals(lastName, user.getLastName(),()->"User's last name is incorrect");
		assertEquals(email, user.getEmail(),()->"User's email is incorrect");
		assertNotNull(user.getId(),()->"User id is missing");
	}
	
	
}
