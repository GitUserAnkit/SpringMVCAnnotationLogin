package com.ankit.command;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.validation.annotation.Validated;

@Validated
public class UserCommand {
	// adding api supplied validation annotation
	@NotEmpty(message = "NotEmpty.UserCmd.username")
	private String username;
	@NotEmpty(message = "NotEmpty.UserCmd.password")
	private String password;

	// setter and getter
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
