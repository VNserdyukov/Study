package OOP.Module4.StandartInterface.PurchaseTeacher;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Purchase[] list = new Purchase[scan.nextInt()];
        for (int i = 0; i < list.length; i++) {
            list[i] = new Purchase(scan.next(), scan.nextInt(), scan.nextInt());
        }
        Arrays.sort(list);
        print(list);
        System.out.println();
        Arrays.sort(list, new Comparator<Purchase>() {
            @Override
            public int compare(Purchase o1, Purchase o2) {
                return o1.getCost() - o2.getCost();
            }
        });
        print(list);
    }

    public static void print(Purchase[] list) {
        for (Purchase item : list) {
            System.out.println(item);
        }
    }
}
