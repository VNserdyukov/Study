package BoostJava.Module6.StandartFunctionalInterface.LiftPrice;

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

        list.forEach(p -> p.setPrice((int) (p.getPrice() * 1.05)));
        list.forEach(p -> System.out.println(p));

    }
}