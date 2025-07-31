package BoostJava.Module1.InOutByteNext.RandomAccess;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {
    public static void main(String[] args) {
        try (RandomAccessFile input = new RandomAccessFile(
                "./src/BoostJava/Module1/InOutByteNext/RandomAccess/data.bin", "r")) {
            input.seek(6*Integer.BYTES);
            int data = input.readInt();
            System.out.println(data);
        } catch (IOException ex) {
            System.out.println("Ошибка " + ex.getMessage());
        }
    }
}
