package BoostJava.Module1.InOutSymbol.LowerPrice;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        Purchase[] buys = null;
        int lowerPrice = 0;
        try (BufferedReader br = new BufferedReader(new FileReader
                ("./src/BoostJava/Module1/InOutSymbol/LowerPrice/purchases.txt", StandardCharsets.UTF_8))) {
            String buffer;
            int number = Integer.parseInt(br.readLine());
            buys = new Purchase[number];
            for (int i = 0; i < buys.length; i++) {
                buffer = br.readLine();
                String[] parts = buffer.split(";");
                buys[i] = new Purchase(parts[0], Integer.parseInt(parts[1]), Double.parseDouble(parts[2]));
            }
        } catch (IOException ex) {
            System.out.println("Ошибка чтения из файла + " + ex.getMessage());
        }
        for (int i = 0; i < buys.length; i++) {
            if (buys[i].lowerPrice() <= buys[lowerPrice].lowerPrice()) {
                lowerPrice = i;
            }
        }
        System.out.println(buys[lowerPrice]);
    }
}

