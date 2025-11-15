package com.github.tahamostafa06.backend;

import java.io.IOException;

import com.github.tahamostafa06.backend.api.BaseUserApi;
import com.github.tahamostafa06.backend.api.InstructorApi;
import com.github.tahamostafa06.backend.api.StudentApi;
import com.github.tahamostafa06.backend.auth.Session;
import com.github.tahamostafa06.backend.database.UserDatabase;
import com.github.tahamostafa06.backend.userservice.User;

// Initialize Databases
// A singleton
// Grant API access

public class Server {
    private static Server serverInstance = null;
    private UserDatabase userDb;


    public Server getServer() throws Exception {
        if (Server.serverInstance == null) {
            return new Server();
        } else {
            return Server.serverInstance;
        }
    }

    private Server() throws Exception {
    }

    public BaseUserApi login(String username, String password) {
        if (true) {
            return new StudentApi();
        } else {
            return new InstructorApi();
        }
    }
}
