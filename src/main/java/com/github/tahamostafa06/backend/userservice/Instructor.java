package com.github.tahamostafa06.backend.userservice;

import java.util.ArrayList;

public class Instructor extends User {
    private ArrayList<String> createdCourses;
    public Instructor(String userId, String role, String username, String email, String passwordHash, ArrayList<String> createdCourses) {
        super(userId, role, username, email, passwordHash);
        this.createdCourses = createdCourses;
    }
}
