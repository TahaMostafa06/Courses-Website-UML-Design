package com.github.tahamostafa06.backend.database.records;

public class User implements Record {
	private String role;
	private String username;
	private String email;
	private String passwordHash;

	private User() {
	}

	public String getRole() {
		return role;
	}

	public String getUsername() {
		return username;
	}

	public String getEmail() {
		return email;
	}

	public String getPasswordHash() {
		return passwordHash;
	}
}
