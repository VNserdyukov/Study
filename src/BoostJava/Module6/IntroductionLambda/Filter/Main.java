package BoostJava.Module6.IntroductionLambda.Filter;

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
        String filter = scan.nextLine();

        printPurchases(purchases, p -> p.getName().equals(filter));

        System.out.println();

        printPurchases(purchases, p -> p.getCost() >= 2000);
    }

    public static void printPurchases(List<Purchase> list, TestPurchases purchases) {
        boolean found = false;
        for (int i = 0; i < list.size(); i++) {
            Purchase purchase = list.get(i);
            if (purchases.test(purchase)) {
                System.out.println(purchase);
                found =true;
            }
        }
        if (!found) {
            System.out.println("Error");
        }
    }
}