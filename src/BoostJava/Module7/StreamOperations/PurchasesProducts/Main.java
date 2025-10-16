package BoostJava.Module7.StreamOperations.PurchasesProducts;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Purchase> purchases = new ArrayList<>();
        String line;

        while (!"end".equals(line = scan.nextLine())) {
            String[] parts = line.split(" ");
            Purchase purchase = new Purchase(parts[0]);
            for (int i = 0; i < Integer.parseInt(parts[1]); i++) {
                String purchaseData = scan.nextLine().trim();
                String[] parts2 = purchaseData.split(" ");
                Commodity commodity = new Commodity(parts2[0], Integer.parseInt(parts2[1]));
                purchase.addItem(commodity, Double.parseDouble(parts2[2]));
            }
            purchases.add(purchase);
        }

        purchases.stream().flatMap(purchase -> purchase.getBuyProducts().keySet().stream())
                .collect(Collectors.toSet())
                .stream().sorted()
                .forEach(System.out::println);
    }
}
