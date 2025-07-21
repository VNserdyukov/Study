package OOP.Module5.ObserverNewspapper;

public interface Publisher {
    void registerSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void notifySubscribers(int issueNumber);
}
