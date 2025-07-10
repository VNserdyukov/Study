package OOP.Module4.Jeneric.Jeneric4Set;

import java.util.Scanner;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MySet<Purchase> set = new MySet<>(3);

        String buffer = scan.nextLine();
        while (!"end".equals(buffer)) {
            String[] parts = buffer.split(" "); //разделяем на слова
            set.add(new Purchase(parts[0], Integer.parseInt(parts[1]), Integer.parseInt(parts[2])));
            buffer = scan.nextLine();
        }

        set.print();
    }
}
