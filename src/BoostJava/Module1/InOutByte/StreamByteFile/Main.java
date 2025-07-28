package BoostJava.Module1.InOutByte.StreamByteFile;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (FileInputStream in = new
                FileInputStream("./src/BoostJava/Module1/InOutByte/StreamByteFile/info.dat");) {
            int item;
            int kol = 0;
            while((item = in.read()) != -1) {
                if (item >= 50 & item <= 100) {
                    kol++;
                }
            }
            System.out.println(kol);
        } catch (IOException ex) {
            System.out.println("Ошибка " + ex.getMessage());
        }
    }
}
