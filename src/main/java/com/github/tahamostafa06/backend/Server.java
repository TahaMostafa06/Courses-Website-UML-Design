package com.github.tahamostafa06.backend;

import com.github.tahamostafa06.backend.database.CourseDatabase;
import com.github.tahamostafa06.backend.database.UserDatabase;

// Initialize Databases
// A singleton
// Grant API access

public class Server {
    private static Server serverInstance = null;
    private UserDatabase userDb;
    private CourseDatabase courseDb;


    public Server getServer() throws Exception {
        if (Server.serverInstance == null) {
            return new Server();
        } else {
            return Server.serverInstance;
        }
    }

    

    private Server() throws Exception {
        this.userDb = new UserDatabase();
        this.courseDb = new CourseDatabase();
    }

}
