package OOP.Module4.StandartInterface.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        Garage garage = new Garage(size);
        while (true) {
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    String brand = scan.next();
                    double engine = scan.nextDouble();
                    int box = scan.nextInt();
                    Car car = new Car(brand, engine);
                    try {
                        if (garage.isFree(box)) {
                            garage.putCar(car, box);
                        } else {
                            if (garage.getFreeBoxNumber() != -1) {
                                garage.putCar(car, garage.getFreeBoxNumber());
                            }
                        }
                    } catch (ErrorBoxException e) {
                        System.out.println("ERROR");
                    }
                    break;
                case 2:
                    int boxNumber = scan.nextInt();
                    try {
                        System.out.println(garage.getCar(boxNumber));
                    } catch (ErrorBoxException e) {
                        System.out.println("ERROR");
                        ;
                    }
                    break;
                case 3:
                    System.out.println("----------------");
                    for (Car cars : garage) {
                        System.out.println(cars == null ? "null" : cars.toString());
                    }
                    System.out.println("----------------");
                break;
                default:
                    return;
            }
        }
    }
}
