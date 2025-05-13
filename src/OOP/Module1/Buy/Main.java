package OOP.Module1.Buy;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        Commodity comm = new Commodity();
        comm.name = scan.nextLine();
        comm.price = scan.nextInt();

        Purchase purch = new Purchase();
        purch.commodity = comm;
        purch.amount = scan.nextInt();
        purch.show();

        comm.price = scan.nextInt();

        System.out.println();
        purch.show();
    }
}
