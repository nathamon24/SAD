package Behavioral1;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

public class NewsReader implements Subscriber<News> {

    private final String reader;

    NewsReader(String reader) {
        this.reader = reader;
    }

    @Override
    public void onSubscribe(Subscription subscription) {
        System.out.println(reader + "is subscribed to " + subscription.getClass().getName());
    }

    @Override
    public void onNext(News item) {
        System.out.println(reader + " get the news : " + item.getContent());
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println("Error.");
    }

    @Override
    public void onComplete() {
        System.out.println("Complete.");
    }
}