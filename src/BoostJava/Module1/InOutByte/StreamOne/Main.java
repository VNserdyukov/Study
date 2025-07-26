package BoostJava.Module1.InOutByte.StreamOne;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        byte[] data = new byte[10];
        try {
            int number = System.in.read(data);
            System.out.write(data,0, number);
        } catch (IOException e) {
            System.out.println("Ошибка ввода - вывода: " + e.getMessage());;
        }
    }
}
