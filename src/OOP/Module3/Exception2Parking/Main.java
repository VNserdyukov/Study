package OOP.Module3.Exception2Parking;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        byte maxQuantity = 10;
        Parking parking = new Parking(maxQuantity);
        Scanner scan = new Scanner(System.in);
        byte cars = scan.nextByte();
        try {
            System.out.println("Приехали на парковку");
            parking.check(cars);
            System.out.println("Припарковались");
        } catch (TooManyCarsException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Припарковались в другом месте");
        } finally {
            System.out.println("Выходим из машин");
        }

    }
}
