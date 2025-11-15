package com.github.tahamostafa06.backend.userservice;

public class User {
    protected String userId;
    protected String role;
    protected String username;
    protected String email;
    protected String passwordHash;

    public User(String userId, String role, String username, String email, String passwordHash) {
        this.userId = userId;
        this.role = role;
        this.username = username;
        this.email = email;
        this.passwordHash = passwordHash;
    }
}
