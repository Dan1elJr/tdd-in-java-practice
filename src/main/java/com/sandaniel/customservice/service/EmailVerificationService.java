package com.sandaniel.customservice.service;

import com.sandaniel.customservice.model.User;

public interface EmailVerificationService {
	void scheduleEmailConfirmation(User user);
}
