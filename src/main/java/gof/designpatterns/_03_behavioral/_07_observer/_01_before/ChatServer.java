package gof.designpatterns._03_behavioral._07_observer._01_before;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatServer {

    private Map<String, List<String>> chatMap = new HashMap<>();

    public void add(String subject, String message) {
        if (chatMap.containsKey(subject)) {
            chatMap.get(subject).add(message);
        } else {
            List<String> messageList = new ArrayList<>();
            messageList.add(message);
            chatMap.put(subject, messageList);
        }
    }

    public List<String> getMessage(String subject) {
        return chatMap.get(subject);
    }
}
