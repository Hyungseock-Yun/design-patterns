package gof.designpatterns._03_behavioral._07_observer._01_before;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class User {

    private ChatServer chatServer;

    public void sendMessage(String subject, String message) {
        chatServer.add(subject, message);
    }

    public List<String> getMessage(String subject) {
        return chatServer.getMessage(subject);
    }
}
