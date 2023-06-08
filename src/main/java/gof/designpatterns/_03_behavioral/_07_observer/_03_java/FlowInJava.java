package gof.designpatterns._03_behavioral._07_observer._03_java;

import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;

/**
 * 비동기
 * RxJava
 * Reactor
 * Reactive stream
 * 예쓰
 */
public class FlowInJava {

    public static void main(String[] args) {
        Flow.Publisher<String> publisher = new SubmissionPublisher<>();

//        Flow.Publisher<String> publisher = new Flow.Publisher<String>() {
//            @Override
//            public void subscribe(Flow.Subscriber<? super String> subscriber) {
//                subscriber.onNext("hello flow");
//                subscriber.onComplete();
//            }
//        };

        Flow.Subscriber<String> subscriber = new Flow.Subscriber<String>() {

            private Flow.Subscription subscription;

            @Override
            public void onSubscribe(Flow.Subscription subscription) {
                System.out.println("sub!!");
                this.subscription = subscription;
                this.subscription.request(1);
            }

            @Override
            public void onNext(String item) {
                System.out.println("onNext Called");
                System.out.println(Thread.currentThread().getName());
                System.out.println(item);
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onComplete() {
                System.out.println("completed");
            }
        };

        publisher.subscribe(subscriber);

        ((SubmissionPublisher) publisher).submit("hello java");
        System.out.println("이게 먼저 출력될 수도 있습니다.");
//        System.out.println("이게 출력이 되기 전에 이미 처리가 다 끝남.");
    }
}
