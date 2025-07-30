package BoostJava.Module1.InOutSymbol.SelectNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int kol = 0;
        double sum = 0;
        try {
            while (!(str = br.readLine()).equals("stop")) {
                String[] words = str.split(" +");
                for (String word : words) {
                    try {
                        Integer.parseInt(word);
                        kol++;
                    } catch (NumberFormatException e) {
                        try {
                            double numberDouble = Double.parseDouble(word);
                            sum += numberDouble;
                        } catch (NumberFormatException ex) {
                        }
                    }
                }
            }
            System.out.printf("%d %.1f", kol, sum);
        } catch (IOException ex) {
            System.out.println("Ошибка ввода " + ex.getMessage());
        }
    }
}