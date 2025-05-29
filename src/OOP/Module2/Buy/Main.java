package OOP.Module2.Buy;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int mas = scan.nextInt();
        Purchase[] buy = new Purchase[mas];
        FixDiscountPurchase.setDiscount(scan.nextDouble());
        FlowDiscountPurchase.setMinAmount(scan.nextInt());

        for (int i = 0; i < buy.length; i++) {
            int type = scan.nextInt();
            String name = scan.next();
            int price = scan.nextInt();
            int amount = scan.nextInt();
            switch (type) {
                case 1:
                    buy[i] = new Purchase(new Commodity(name, price), amount);
                    break;
                case 2:
                    buy[i] = new FixDiscountPurchase(new Commodity(name, price), amount);
                    break;
                case 3:
                    buy[i] = new FlowDiscountPurchase(new Commodity(name, price), amount);
                    break;
                default:
                    buy[i] = null;
            }
        }

        for (Purchase buys : buy) {
            System.out.println(buys);
        }

        int maxBuy = buy[0].getCost();
        for (Purchase purchase : buy) {
            if (purchase.getCost() > maxBuy) {
                maxBuy = purchase.getCost();
            }
        }

        for (int i = 0; i < buy.length; i++) {
            if (buy[i].getCost() == maxBuy) {
                System.out.println(i);
                break;
            }
        }

        int sum = 0;
        for (int i = 0; i < buy.length - 1; i++) {
            if (buy[i].equals(buy[i + 1])) {
                sum += 1;
            }
        }

        if (sum == buy.length - 1) {
             System.out.println("YES");
        } else {
             System.out.println("NO");
        }

    }
}
