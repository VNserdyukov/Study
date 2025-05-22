package OOP.Module1.Buy;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int mas = scan.nextInt();
        if (mas < 0) {
            System.out.println("ERROR");
            return;
        }

        Purchase[] buy = new Purchase[mas];
        for (int i = 0; i < buy.length; i++) {
            buy[i] = new Purchase(new Commodity(scan.next(), scan.nextInt()), scan.nextInt());
        }

        int maxBuy = buy[0].getCost();

        for (Purchase purchase : buy) {
            if (purchase.getCost() >= maxBuy) {
                maxBuy = purchase.getCost();
            }
        }

        for (Purchase purchase : buy) {
            if (purchase.getCost() == maxBuy) {
                System.out.println(purchase);
            }
        }
    }
}
