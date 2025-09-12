package BoostJava.Module6.StandartFunctionalInterface.TwoStageSort;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;

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
        Comparator<Purchase> comparatorName = Comparator.comparing(Purchase::getName);
        Comparator<Purchase> comparatorCost = comparatorName.thenComparing(purchase -> -purchase.getCost());
        // можно использовать мину "-" перед purchase.getCost()) для сортировки по убыванию
        list.sort(comparatorCost);
        list.forEach(System.out::println);
    }
}