package org.example;

public class CommandExecutor {

        public void executeCommand(String command) {
            try {
                Runtime.getRuntime().exec(command);
            } catch (Exception e) {

            }
        }
}
