package OOP.Module4.Jeneric.Jeneric6Vasia;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Purchase> list = new ArrayList<>();

        String buffer = scan.nextLine();
        while (!"end".equals(buffer)) {
            String[] data = buffer.split(" ");
            if (data[0].equals("1")) {
                list.add(new Purchase(data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3])));
            } else {
                list.add(new DiscountPurchase(data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]), Integer.parseInt(data[4])));
            }
            buffer = scan.nextLine();
        }

        System.out.println("Total sum = " + getTotalSum(list));

    }

    public static int getTotalSum(ArrayList<Purchase> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i).getCost();
        }
        return sum;
    }
}
