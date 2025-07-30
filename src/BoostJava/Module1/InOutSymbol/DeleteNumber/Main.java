package BoostJava.Module1.InOutSymbol.DeleteNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char c;
        try {
            while ((c = (char) br.read()) != '#') {
                if (!Character.isDigit(c)) {
                    System.out.print(c);
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}