package org.example;

import java.util.HashMap;
import java.util.Map;

public class CommandExecutor {

    // Vulnerable method with hardcoded password
    public String authenticate(String userProvidedPassword) {
        String hardcodedPassword = "password123";
        if (userProvidedPassword.equals(hardcodedPassword)) {
            return "Authentication successful!";
        } else {
            return "Authentication failed!";
        }
    }
}
