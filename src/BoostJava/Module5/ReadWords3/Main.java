package BoostJava.Module5.ReadWords3;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("./src/BoostJava/Module5/ReadWords3/data.txt"))){
            Controller controller = new Controller(br);
            Job one = new Job(controller);
            Job two = new Job(controller);
            Thread t1 = new Thread(one,"first");
            Thread t2 = new Thread(two,"second");
            t1.start();
            t2.start();
            try {
                t1.join();
                t2.join();
            } catch (InterruptedException e) {
                throw new RuntimeException();
            }
            System.out.println("Первый поток считал: " + one.getList());
            System.out.println("Второй поток считал: " + two.getList());
        }catch(FileNotFoundException e){
            System.out.println("Файл не найден");
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}