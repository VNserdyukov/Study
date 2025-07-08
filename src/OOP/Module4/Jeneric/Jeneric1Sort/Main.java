package OOP.Module4.Jeneric.Jeneric1Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> listPos = new ArrayList<>();
        ArrayList<Integer> listNeg = new ArrayList<>();

        while (true) {
            try {
                String elem = scan.next();
                if (elem.equals("finish")) break;
                int number = Integer.parseInt(elem);
                if (number >= 0) {
                    listPos.add(number);
                } else {
                    listNeg.add(number);
                }
            } catch (NumberFormatException exc) {
                listPos.add(0);
            }
        }

        Collections.sort(listPos);
        Collections.sort(listNeg);

        if (listPos.isEmpty()) {
            System.out.print("Пустой список");
        }

        for (Integer listPo : listPos) {
            System.out.print(listPo + " ");
        }

        System.out.println();

        if (listNeg.isEmpty()) {
            System.out.print("Пустой список");
        }

        for (Integer integer : listNeg) {
            System.out.print(integer + " ");
        }

    }
}
