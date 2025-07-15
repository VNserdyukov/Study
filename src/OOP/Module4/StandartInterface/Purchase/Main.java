package OOP.Module4.StandartInterface.Purchase;

import java.util.Comparator;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Purchase[] purchases = new Purchase[scan.nextInt()];
        scan.nextLine();
        for (int i = 0; i < purchases.length; i++) {
            String buffer = scan.nextLine();
            String[] data = buffer.split(" ");
            purchases[i] = new Purchase(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]));
        }
        sort(purchases, new Comparator<Purchase>() {
            @Override
            public int compare(Purchase o1, Purchase o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (Purchase buy : purchases) {
            System.out.println(buy);
        }
        System.out.println();
        sort(purchases);
        for (Purchase buy : purchases) {
            System.out.println(buy);
        }
    }
}


