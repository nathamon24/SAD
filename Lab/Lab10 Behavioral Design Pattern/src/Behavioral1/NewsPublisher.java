package Behavioral1;

import java.util.HashSet;
import java.util.concurrent.Flow.Publisher;
import java.util.concurrent.Flow.Subscriber;

public class NewsPublisher implements Publisher<News> {

    private HashSet<Subscriber<? super News>> people = new HashSet<>();

    void publish(News news) {
        people.forEach((Subscriber<? super News> subscriber) -> {
            subscriber.onNext(news);
        });
    }

    @Override
    public void subscribe(Subscriber<? super News> subscriber) {
        people.add(subscriber);

    }

    public void unsubscribe(Subscriber<? super News> subscriber) {
        people.remove(subscriber);
    }

}
