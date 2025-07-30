package BoostJava.Module1.InOutSymbol.SelectNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        double summa = 0;
        int count = 0;
        try {
            while (!(str = br.readLine()).equals("stop")) {
                String[] words = str.split(" +");
                for (String word : words) {
                    try {
                        double number = Double.parseDouble(word);
                        if (number % 1 == 0) {
                            count++;
                        } else {
                            summa += number;
                        }
                    } catch (NumberFormatException ex) {
                    }
                }
            }
            System.out.println(count + String.format(" %.1f",summa));
        } catch (IOException ex) {
            System.out.println("Ошибка ввода: " + ex.getMessage());
        }
    }
}
