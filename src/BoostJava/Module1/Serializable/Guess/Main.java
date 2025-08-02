package BoostJava.Module1.Serializable.Guess;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {
    public static void main(String[] args) {
        try(ObjectInputStream is = new ObjectInputStream(
                new FileInputStream("./src/BoostJava/Module1/Serializable/Guess/enigma.ser"))){
            String obj =(String) is.readObject(); //читаем объект из файла
            System.out.println(obj); //выводим на консоль
        }catch(IOException ex){
            System.out.println("Ошибка чтения: " + ex.getMessage());
        }catch(ClassNotFoundException ex){
            System.out.println("Не найден файл для десериализации" + ex.getMessage());
        }
    }
}
