package OOP.Module1.Buy;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        Commodity.name = scan.nextLine();
        Commodity.price = scan.nextInt();
        Purchase buy2 = new Purchase();
        buy2.name = Commodity.name;
        buy2.amount = scan.nextInt();
    }
}
