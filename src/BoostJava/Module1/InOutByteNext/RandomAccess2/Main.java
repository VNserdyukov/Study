package BoostJava.Module1.InOutByteNext.RandomAccess2;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {
    public static void main(String[] args) {
        try (RandomAccessFile input = new RandomAccessFile(
                "./src/BoostJava/Module1/InOutByteNext/RandomAccess2/my.bin", "r")) {
            double first = input.readDouble();
            input.seek(9*Double.BYTES);
            double last = input.readDouble();
            System.out.printf("%.3f", first + last);
        } catch (IOException ex) {
            System.out.println("Ошибка " + ex.getMessage());
        }
    }
}
