package BoostJava.Module2.List.Commodity;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Commodity> commodityBel = new ArrayList<>();
        List<Commodity> commodityOther = new ArrayList<>();
        String line;

        try {
            while (!"end".equals(line = br.readLine())) {
                try {
                    String[] parts = line.split("/");
                    Commodity commodity = new Commodity(parts[0], Integer.parseInt(parts[1]), parts[2]);
                    if (parts[2].equals("Беларусь")) {
                        commodityBel.add(commodity);
                    } else {
                        commodityOther.add(commodity);
                    }
                } catch (Exception w) {

                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        if (commodityBel.isEmpty()) {
            System.out.println("Список товаров из Беларуси пуст");
        }

        Collections.sort(commodityBel);
        for (Commodity commodity : commodityBel) {
            System.out.println(commodity);
        }

        System.out.println();

        if (commodityOther.isEmpty()) {
            System.out.println("Список товаров из других стран пуст");
        }

        commodityOther.sort(new Comparator<Commodity>() {
            @Override
            public int compare(Commodity o1, Commodity o2) {
                return Integer.compare(o2.getPrice(), o1.getPrice());
            }
        });
        for (Commodity commodity : commodityOther) {
            System.out.println(commodity);
        }
    }
}
