package BoostJava.Module5.ReadWords2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("./src/BoostJava/Module5/ReadWords/data.txt"))){
            Job one = new Job(br);
            Job two = new Job(br);
            Job three = new Job(br);
            Thread t1 = new Thread(one,"first");
            Thread t2 = new Thread(two,"second");
            Thread t3 = new Thread(three,"third");
            t1.start();
            t2.start();
            t3.start();
            try {
                Thread.sleep(30);
                t1.interrupt();
                t2.interrupt();
                t3.interrupt();
                t1.join();
                t2.join();
                t3.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Первый поток считал: " + one.getList());
            System.out.println("Второй поток считал: " + two.getList());
            System.out.println("Третий поток считал: " + three.getList());
        }catch(FileNotFoundException e){
            System.out.println("Файл не найден");
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
