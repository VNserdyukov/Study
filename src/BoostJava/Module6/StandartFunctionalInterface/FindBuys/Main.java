package BoostJava.Module6.StandartFunctionalInterface.FindBuys;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.Optional;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Purchase> list = new ArrayList<>();
        String str = scan.nextLine();
        while (!"end".equals(str)) {
            String[] parts = str.split(";");
            list.add(new Purchase(parts[0], Integer.parseInt(parts[1]), Integer.parseInt(parts[2])));
            str = scan.nextLine();
        }

    }
    public static void findFirst(List<Purchase> list, Predicate<Purchase> purchases) {
        for (Purchase purchase : list) {
            if (purchases.test(purchase)) {
                System.out.println(purchase);
            }
        }
    }
}