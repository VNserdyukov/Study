package BoostJava.Module1.InOutByteNext.ReadNumberInt;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (DataInputStream input = new DataInputStream(
                new FileInputStream("./src/BoostJava/Module1/InOutByteNext/ReadNumberInt/array.dat"))) {
            int item = input.readInt();
            double sum = 0;
            for (int i = 0; i < item; i++) {
                sum += input.readInt();
            }
            System.out.printf("%.1f", sum/item);
        } catch (IOException ex) {
            System.out.println("Ошибка " + ex.getMessage());
        }
    }
}
