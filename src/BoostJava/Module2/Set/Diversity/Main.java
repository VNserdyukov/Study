package BoostJava.Module2.Set.Diversity;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<Product> set = new TreeSet<>();
        String buffer = scan.nextLine();
        while (!"end".equals(buffer)) {
            String[] parts = buffer.split("#");
            Product product = new Product(parts[0], Integer.parseInt(parts[2]));
            set.add(product);
            buffer = scan.nextLine();
        }
        for (Product item : set) {
            System.out.println(item);
        }
    }
}

