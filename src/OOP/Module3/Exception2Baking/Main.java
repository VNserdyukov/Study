package OOP.Module3.Exception2Baking;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        Cook dish = new Cook();
        try {
            dish.turnOvenOn();
            dish.bake(product);
            System.out.println("Блюдо готово");
        } catch (BakingException ex) {
            System.out.println("Блюдо полностью испортилось: " + ex.getMessage());
        } finally {
            dish.turnOvenOff();
        }
    }
}
