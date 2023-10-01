package org.example;

import java.util.HashMap;
import java.util.Map;

public class CommandExecutor {

    // Vulnerable method that exposes sensitive data
    public String retrieveSensitiveData() {
        String username = "admin";
        String password = "12345";

        // Simulate the exposure of sensitive data in an error message
        if (!authenticate(username, password)) {
            throw new RuntimeException("Authentication failed for user: " + username);
        }

        // Return sensitive data (in a real application, this should not happen)
        return "Welcome, " + username;
    }

    // Simulated user authentication (replace with actual authentication logic)
    private boolean authenticate(String username, String password) {
        // In a real implementation, check the username and password against a database or authentication service
        return "correct_username".equals(username) && "correct_password".equals(password);
    }
}
