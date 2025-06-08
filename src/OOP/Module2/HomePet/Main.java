package OOP.Module2.HomePet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int mas = scan.nextInt();
        Pet[] pets = new Pet[mas];
        for (int i = 0; i < pets.length; i++) {
            int type = scan.nextInt();
            String name = scan.next();
            int age = scan.nextInt();
            switch (type) {
                case 1:
                    String breed = scan.next();
                    pets[i] = new Dog(name, age, breed);
                    break;
                case 2:
                    String color = scan.next();
                    pets[i] = new Cat(name, age, color);
                    break;
                default:
                    pets[i] = null;
            }
        }

        for (Pet pet : pets) {
            System.out.print(pet.getClass().getSimpleName() + " " + pet.getName() + ":");
            pet.getNoise();
        }
        System.out.println();

        for (Pet pet : pets){
            if (pet instanceof Cat) {
                System.out.println(pet);
            }
        }

    }
}
