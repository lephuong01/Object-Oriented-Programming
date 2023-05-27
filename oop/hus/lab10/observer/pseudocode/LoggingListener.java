package oop.hus.lab10.observer.pseudocode;

import java.io.File;

public class LoggingListener implements EventListeners {
    private File log;
    private String message;

    public LoggingListener(String log_file, String message) {
        log = new File(log_file);
        this.message = message;
    }

    @Override
    public void update(String filename) {
        String newMessage = message.replace("%s", filename);
        System.out.println("write to " + log.getName() + "\"" + newMessage + "\"");
    }
}
