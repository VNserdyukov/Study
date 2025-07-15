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
            purchases[i] = new Purchase(scan.next(), scan.nextInt(), scan.nextInt());
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


