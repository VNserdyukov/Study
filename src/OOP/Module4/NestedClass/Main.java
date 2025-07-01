package OOP.Module4.NestedClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Dog dog1 = new Dog(scan.next(), scan.next(), scan.next(), scan.nextDouble());
        scan.nextLine();
        Dog dog2 = new Dog(scan.next(), scan.next(), scan.next(), scan.nextDouble());
        if (dog1.compareTo(dog2) == 1) {
            System.out.println("Первая собака больше");
        }
        if (dog1.compareTo(dog2) == -1) {
            System.out.println("Вторая собака больше");
        }
        if (dog1.compareTo(dog2) == 0) {
            System.out.println("Собаки одинакового размера");
        }
    }
}
