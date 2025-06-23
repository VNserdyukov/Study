package OOP.Module3.Exception2Weight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double economStandart = 10;
        Luggage luggage = new Luggage(economStandart);
        Scanner scan = new Scanner(System.in);
        double weight = scan.nextDouble();
        System.out.println("Надо пройти регистрацию на рейс");
        try {
            luggage.checkLuggage(weight);
            System.out.println("Доплата за вес не нужна");
        } catch (HeavyLuggageException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Нужно оплатить превышение веса по тарифу");
        } finally {
            System.out.println("Регистрация пройдена");
        }
    }
}
