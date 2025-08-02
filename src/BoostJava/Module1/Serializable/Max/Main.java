package BoostJava.Module1.Serializable.Max;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = null;
        try(ObjectInputStream is = new ObjectInputStream(
                new FileInputStream("./src/BoostJava/Module1/Serializable/Max/list.ser"))){
            list = (ArrayList<Integer>) is.readObject(); //читаем объект из файла
        }catch(IOException ex){
            System.out.println("Ошибка чтения: " + ex.getMessage());
        }catch(ClassNotFoundException ex){
            System.out.println("Не найден файл для десериализации" + ex.getMessage());
        }
        int max = list.get(0);
        for (Integer item : list) {
            if (item > max) {
                max = item;
            }
        }
        System.out.println(max);
    }
}
