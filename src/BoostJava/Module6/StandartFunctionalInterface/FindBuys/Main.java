package BoostJava.Module6.StandartFunctionalInterface.FindBuys;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.Optional;
import java.util.function.Supplier;

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
        Supplier<Purchase> supplier = () -> new Purchase("Покупка не найдена", 0, 0);
        Optional<Purchase> optional = findFirst(list, p -> p.getName().startsWith("М"));
        System.out.println("Первая покупка на букву М: " + optional.orElseGet(supplier));
        Optional<Purchase> optionalCost = findFirst(list, p -> p.getCost() > 1000);
        System.out.println("Первая покупка со стоимостью больше 1000: " + optionalCost.orElseGet(supplier));
    }

    public static Optional<Purchase> findFirst(ArrayList<Purchase> list, Predicate<Purchase> purchases) {
        Purchase result = null;
        for (Purchase purchase : list) {
            if (purchases.test(purchase)) {
                result = purchase;
                break;
            }
        }
        return Optional.ofNullable(result);
    }

}