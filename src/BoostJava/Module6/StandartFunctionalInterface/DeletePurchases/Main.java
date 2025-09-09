package BoostJava.Module6.StandartFunctionalInterface.DeletePurchases;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Purchase> list = new ArrayList<>();
        String str = scan.nextLine();
        while (!"end".equals(str)) {
            String[] parts = str.split(";");
            list.add(new Purchase(parts[0], Integer.parseInt(parts[1]), Integer.parseInt(parts[2])));
            str = scan.nextLine();
        }

        list.removeIf(p -> p.getAmount() > 3);
        list.sort((o1, o2) -> o2.getCost() - o1.getCost());
        for (Purchase purchase:list) {
            System.out.println(purchase);
        }

    }
}