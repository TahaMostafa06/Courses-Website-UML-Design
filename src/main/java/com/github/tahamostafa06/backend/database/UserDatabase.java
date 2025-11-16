package com.github.tahamostafa06.backend.database;

import java.io.IOException;

import com.github.tahamostafa06.backend.database.records.User;

public class UserDatabase extends JsonDatabase<User> {

    public UserDatabase() throws IOException {
        super("Users.json");

    }

    public User getUserByUserId(String userId) {
        return this.getRecord(userId);
    }

    public User getUserByUsername(String username) {
        for (var user : this.records.values()) {
            if (user.getUsername().equals(username))
                return user;
        }
        return null;
    }

    public String getRoleByUsername(String username) {
        for (var user : this.records.values()) {
            if (user.getUsername().equals(username))
                return user.getRole();
        }
        return null;
    }

}
