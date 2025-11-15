package com.github.tahamostafa06.backend.database;

import java.io.IOException;
import java.util.Map.Entry;

import com.github.tahamostafa06.backend.userservice.Instructor;
import com.github.tahamostafa06.backend.userservice.Student;
import com.github.tahamostafa06.backend.userservice.User;
import com.google.gson.Gson;
import com.google.gson.JsonElement;

public class UserDatabase extends JsonDatabase<User> {

    public UserDatabase() throws IOException {
        super("Users.json");

    }

    @Override
    protected User parseEntry(Entry<String, JsonElement> entry) {
        var userId = entry.getKey();
        var role = entry.getValue().getAsJsonObject().get("role").getAsString();
        var userData = entry.getValue().getAsJsonObject();
        userData.addProperty("userId", userId);
        var gson = new Gson();
        if (role.equals("Student")) {
            return gson.fromJson(userData, Student.class);
        } else if (role.equals("Instructor")) {
            return gson.fromJson(userData, Instructor.class);
        } else {
            return gson.fromJson(userData, User.class);
        }
    }

}
