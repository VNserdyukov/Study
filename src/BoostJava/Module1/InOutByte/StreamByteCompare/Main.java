package BoostJava.Module1.InOutByte.StreamByteCompare;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int data1, data2;
        int kol = 0;
        try (FileInputStream one = new
                FileInputStream("./src/BoostJava/Module1/InOutByte/StreamByteCompare/data.dat");
             FileInputStream two = new
                     FileInputStream("./src/BoostJava/Module1/InOutByte/StreamByteCompare/promo.dat")) {
            while((data1 = one.read()) != -1 & (data2 = two.read()) != -1) {
                if (data1 == data2) {
                    kol++;
                }
            }
            System.out.println(kol);
        } catch (IOException ex) {
            System.out.println("Ошибка " + ex.getMessage());
        }
    }
}
