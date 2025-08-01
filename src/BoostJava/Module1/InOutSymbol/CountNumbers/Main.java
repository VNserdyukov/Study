package BoostJava.Module1.InOutSymbol.CountNumbers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader fr = new BufferedReader(
                new FileReader("./src/BoostJava/Module1/InOutSymbol/CountNumbers/data2.txt"))) {
            int count = 0;
            int fileReader = fr.read();
            while (fileReader != -1) {
                if (fileReader >= '0' && fileReader <= '9') {
                    count++;
                }
                fileReader = fr.read();
            }
            System.out.println(count);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
