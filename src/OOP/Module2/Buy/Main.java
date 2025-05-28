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

        }
    }
}
