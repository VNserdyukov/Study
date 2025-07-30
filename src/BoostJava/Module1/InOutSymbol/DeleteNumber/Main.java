package BoostJava.Module1.InOutSymbol.DeleteNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char c;
        try {
            c = (char) br.read();
            while (c != '#') {
                try {
                    Integer.parseInt(String.valueOf(c));
                    c = (char) br.read();
                } catch (NumberFormatException e) {
                    System.out.print(c);
                    c = (char) br.read();
                }
            }
        } catch (IOException ex) {
            System.out.println("Ошибка ввода " + ex.getMessage());
        }
    }
}
