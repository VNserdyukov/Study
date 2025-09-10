package BoostJava.Module6.StandartFunctionalInterface.SupplierString;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String data = scan.nextLine();

        StringSupplier supplier = new StringSupplier(data);
        for (int i = 0; i < 5; i++) {
            System.out.println(supplier.get());
        }
    }
}
