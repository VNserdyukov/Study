package OOP.Module5.ObserverNewspapper;

import java.util.ArrayList;
import java.util.List;

public class ForestTruth implements Publisher {
    private List<Subscriber> subscribers = new ArrayList<>();

    @Override
    public void registerSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(int issueNumber) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(issueNumber);
        }
    }

    // Метод для поиска подписчика по имени
    public Subscriber findSubscriberByName(String name) {
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getName().equals(name)) {
                return subscriber;
            }
        }
        return null;
    }
}
