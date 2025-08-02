package BoostJava.Module1.Serializable.Middle;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {
    public static void main(String[] args) {
        double[] mas = null;
        try(ObjectInputStream is = new ObjectInputStream(
                new FileInputStream("./src/BoostJava/Module1/Serializable/Middle/massiv.ser"))){
            mas =(double[]) is.readObject(); //читаем объект из файла
        }catch(IOException ex){
            System.out.println("Ошибка чтения: " + ex.getMessage());
        }catch(ClassNotFoundException ex){
            System.out.println("Не найден файл для десериализации" + ex.getMessage());
        }
        double sum = 0;
        for (double x : mas) {
            sum += x;
        }
        System.out.printf("%.2f", sum / mas.length);
    }
}
