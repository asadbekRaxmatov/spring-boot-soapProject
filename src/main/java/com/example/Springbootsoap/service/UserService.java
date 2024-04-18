package com.example.Springbootsoap.service;

import java.util.HashMap;
import java.util.Map;

public class UserService {

    private Map<String, String> userCredentials = new HashMap<>();

    public UserService() {
        // Pre-populate user credentials
        userCredentials.put("user1", "password1");
        userCredentials.put("user2", "password2");
        userCredentials.put("user3", "password3");
    }

    // Method to authenticate user
    public boolean authenticate(String username, String password) {

        String storedPassword = userCredentials.get(username);

        return storedPassword != null && storedPassword.equals(password);
    }
}
