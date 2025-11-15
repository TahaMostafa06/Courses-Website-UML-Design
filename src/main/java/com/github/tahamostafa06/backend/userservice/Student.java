package com.github.tahamostafa06.backend.userservice;

import java.util.ArrayList;

public class Student extends User {
    private ArrayList<String> enrolledCourses;
    private ArrayList<Integer> progress;

    public Student(String userId, String role, String username, String email, String passwordHash,
            ArrayList<String> enrolledCourses, ArrayList<Integer> progress) {
        super(userId, role, username, email, passwordHash);
        this.enrolledCourses = enrolledCourses;
        this.progress = progress;
    }
}
