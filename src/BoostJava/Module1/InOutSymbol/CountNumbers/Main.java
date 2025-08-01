package BoostJava.Module1.InOutSymbol.CountNumbers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        double sum = 0;
        try (BufferedReader fr = new BufferedReader(
                new FileReader("./src/BoostJava/Module1/InOutSymbol/CalculateMiddle/data3.txt"))) {
            String str;
            while ((str = fr.readLine()) != null) {
                String[] words = str.split(" +");
                for (String item : words) {
                    try {
                        sum += Double.parseDouble(item);
                        count++;
                    } catch (NumberFormatException e) {
                    }
                }
            }
            System.out.printf("%.2f", sum/count);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
