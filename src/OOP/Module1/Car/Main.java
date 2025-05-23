package OOP.Module1.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mas = scan.nextInt();
        Car[] cars = new Car[mas];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(scan.next(), scan.next(), scan.nextDouble(), scan.nextInt());
        }

        int num = scan.nextInt();
        double changeEngine = scan.nextDouble();
        for (int i = 0; i < cars.length ; i++) {
            if (i + 1 == num) {
                cars[i].setEngine(changeEngine);
            }
            System.out.println(cars[i]);
        }
        System.out.println();

        int maxYear = cars[0].getYearOfMade();
        for (Car car : cars) {
            if (car.getYearOfMade() > maxYear) {
                maxYear = car.getYearOfMade();
            }
        }

        for (Car car : cars) {
            if (car.getYearOfMade() == maxYear) {
                System.out.println(car);
                return;
            }
        }

    }
}
