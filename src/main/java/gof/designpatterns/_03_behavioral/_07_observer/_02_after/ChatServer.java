package gof.designpatterns._03_behavioral._07_observer._02_after;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatServer {

    /**
     * Map 안에 있는 Subscriber는 참조가 되고 있으므로 GC의 대상이 되지 않는다.
     * 따라서 계속 쌓이다보면 메모리누수가 발생하여 Out of Memory가 발생할 수 있음.
     * WeakReference 적용
     */
    private Map<String, List<Subscriber>> subscribers = new HashMap<>();

    public void register(String subject, Subscriber subscriber) {
        if (this.subscribers.containsKey(subject)) {
            this.subscribers.get(subject).add(subscriber);
        } else {
            List<Subscriber> list = new ArrayList<>();
            list.add(subscriber);
            this.subscribers.put(subject, list);
        }
    }

    public void unregister(String subject, Subscriber subscriber) {
        if (this.subscribers.containsKey(subject)) {
            this.subscribers.get(subject).remove(subscriber);
        }
    }

    public void sendMessage(User user, String subject, String message) {
        if (this.subscribers.containsKey(subject)) {
            String userMessage = user.getName() + " : " + message;
            this.subscribers.get(subject).forEach(s -> s.handleMessage(userMessage));
        }
    }
}
