package BoostJava.Module6.IntroductionLambda.Sort;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Purchase> purchases = new ArrayList<>();
        String line;

        while (!"end".equals(line = scan.nextLine())) {
            try {
                String[] parts = line.split(";");
                Purchase purchase = new Purchase(parts[0], Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
                purchases.add(purchase);
            } catch (Exception w) {
                w.printStackTrace();
            }
        }

        purchases.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        printPurchases(purchases);

        System.out.println();

        purchases.sort((o1, o2) -> o2.getCost() - o1.getCost());
        printPurchases(purchases);
    }

    public static void printPurchases(List<Purchase> list) {
        for (Purchase purchase: list) {
            System.out.println(purchase);
        }
    }
}
