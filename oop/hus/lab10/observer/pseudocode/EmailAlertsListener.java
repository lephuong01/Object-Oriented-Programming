package oop.hus.lab10.observer.pseudocode;

public class EmailAlertsListener implements EventListeners {
    private String email;
    private String message;

    public EmailAlertsListener(String email, String message) {
        this.email = email;
        this.message = message;
    }

    @Override
    public void update(String filename) {
        String newMessage = message.replace("%s", filename);
        System.out.println("email to " + email + ": \"" + newMessage + "\"");
    }
}
