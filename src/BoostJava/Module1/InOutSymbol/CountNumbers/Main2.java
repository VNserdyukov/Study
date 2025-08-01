package BoostJava.Module1.InOutSymbol.CountNumbers;

import java.io.*;

public class Main2 {
    public static void main(String[] args) {
        int count = 0;
        try(FileReader br = new FileReader("./src/BoostJava/Module1/InOutSymbol/CountNumbers/data3.txt")) {
            while (br.ready()) {
                if (Character.isDigit((char) br.read())) count++;
            }
        } catch (IOException ex) {
        }
        System.out.println(count);
    }
}
