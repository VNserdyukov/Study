package OOP.Module2.Car;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        int mas = scan.nextInt();
        Car[] cars = new Car[mas];

        for (int i = 0; i < cars.length; i++) {
            int type = scan.nextInt();
            String brand = scan.next();
            String nameOwner = scan.next();
            double engine = scan.nextDouble();
            int yearOfMade = scan.nextInt();
            switch (type) {
                case 1:
                    cars[i] = new Car(brand, nameOwner, engine, yearOfMade);
                    break;
                case 2:
                    cars[i] = new Truck(brand, nameOwner, engine, yearOfMade, scan.nextDouble());
                    break;
            }
        }

        for (Car car : cars) {
            System.out.println(car);
        }

        System.out.println();
        double weight = scan.nextDouble();
        boolean find = false;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] instanceof Truck) {
                Truck newTruck = (Truck) cars[i];
                if (newTruck.ifCanCarry(weight) && (newTruck.getLife() <= 7)) {
                    System.out.println(newTruck);
                    find = true;
                }
            }
        }
        if (!find) {
            System.out.println("NO");
        }
    }
}
