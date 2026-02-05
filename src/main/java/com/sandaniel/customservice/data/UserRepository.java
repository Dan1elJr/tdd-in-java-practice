package com.sandaniel.customservice.data;

import com.sandaniel.customservice.model.User;

public interface UserRepository {
	boolean save(User user);
}
