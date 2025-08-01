package BoostJava.Module1.InOutSymbol.LowerPrice2;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        Purchase[] list = null;
        try (BufferedReader br = new BufferedReader(new FileReader
                ("./src/BoostJava/Module1/InOutSymbol/LowerPrice2/purchases2.txt", StandardCharsets.UTF_8))) {
            String buffer;
            int num = Integer.parseInt(br.readLine());
            list = new Purchase[num];
            for (int i = 0; i < list.length; i++) {
                buffer = br.readLine();
                String[] parts = buffer.split(";");
                try {
                    list[i] = new Purchase(parts[0], Integer.parseInt(parts[1]), Double.parseDouble(parts[2]));
                } catch (NumberFormatException | ArrayIndexOutOfBoundsException ex) { //проблемы преобразовать данные
                    list[i] = null;
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        if (list == null) {
            System.out.println("Список пуст!");
            return;
        }

        double min = Double.MAX_VALUE;
        int ind = -1;
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null && list[i].getCost() < min) {
                min = list[i].getCost();
                ind = i;
            }
        }
        if (ind >= 0) {
            System.out.println(list[ind]);
        } else {
            System.out.println("Нет записей!");
        }
    }
}
