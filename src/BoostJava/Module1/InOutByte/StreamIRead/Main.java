package BoostJava.Module1.InOutByte.StreamIRead;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        byte[] data = new byte[128];
        try {
            int number = System.in.read(data);
            System.out.print("Количество байт = " + number);
        }catch(IOException ex){
            System.out.println("Ошибка ввода-вывода: " + ex.getMessage());
        }
    }
}

