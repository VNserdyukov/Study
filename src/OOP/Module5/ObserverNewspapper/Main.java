package OOP.Module5.ObserverNewspapper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameToUnsubscribe = scanner.nextLine();

        ForestTruth newspaper = new ForestTruth();

        Bear potap = new Bear("Потап");
        Bear nastasya = new Bear("Настасья");
        Hare trusishka = new Hare("Трусишка");
        Wolf alex = new Wolf("Алекс");

        newspaper.registerSubscriber(potap);
        newspaper.registerSubscriber(nastasya);
        newspaper.registerSubscriber(alex);
        newspaper.registerSubscriber(trusishka);

        newspaper.notifySubscribers(1);

        System.out.println();

        Subscriber subscriberToRemove = newspaper.findSubscriberByName(nameToUnsubscribe);
        if (subscriberToRemove != null) {
            newspaper.removeSubscriber(subscriberToRemove);
            System.out.println(nameToUnsubscribe + " не хочет получать газету");
        }

        System.out.println();

        newspaper.notifySubscribers(2);
    }
}
