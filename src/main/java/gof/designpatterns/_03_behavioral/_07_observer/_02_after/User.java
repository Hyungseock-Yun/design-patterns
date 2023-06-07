package gof.designpatterns._03_behavioral._07_observer._02_after;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class User implements Subscriber {

    private String name;

    @Override
    public void handleMessage(String message) {
        System.out.println(message);
    }
}
