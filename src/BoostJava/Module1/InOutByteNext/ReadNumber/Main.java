package BoostJava.Module1.InOutByteNext.ReadNumber;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (DataInputStream input = new DataInputStream(
                new FileInputStream("./src/BoostJava/Module1/InOutByteNext/ReadNumber/numbers.info"))) {
            double sum = 0;
            double item;
            for (int i = 0; i < 35; i++) {
                item = input.readDouble();
                sum += item;
            }
            System.out.printf("%.2f", sum);
        } catch (IOException ex) {
            System.out.println("Ошибка " + ex.getMessage());
        }
    }
}
