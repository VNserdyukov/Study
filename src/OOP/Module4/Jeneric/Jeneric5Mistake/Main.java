package OOP.Module4.Jeneric.Jeneric5Mistake;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Purchase> list = new ArrayList<>();
        ArrayList<DiscountPurchase> list2 = new ArrayList<>();
        int type = scan.nextInt();  //читаем тип покупок, которые далее будут в списке
        scan.nextLine(); //очищаем буфер

        String buffer = scan.nextLine();
        while (!"end".equals(buffer)) {
            String[] data = buffer.split(" ");
            if (type == 1) {
                list.add(new Purchase(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2])));
            } else {
                list2.add(new DiscountPurchase(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]), Integer.parseInt(data[3])));
            }
            buffer = scan.nextLine();
        }

        if (type == 1) {
            System.out.println("Total sum = " + getTotalSum(list));
        } else {
            System.out.println("Total sum = " + getTotalSum(list2));
        }
    }

    public static int getTotalSum(ArrayList<? extends Purchase> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i).getCost();
        }
        return sum;
    }
}
