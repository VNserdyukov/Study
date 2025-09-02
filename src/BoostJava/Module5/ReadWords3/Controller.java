package BoostJava.Module5.ReadWords3;

import java.io.*;

public class Controller {
    private BufferedReader br;
    private volatile String status = "first";

    public Controller(BufferedReader br) {
        this.br = br;
    }

    public synchronized String readWord(String name) {
        String result = null;
        try {
            while (!name.equals(status)) { //ожидаем, пока status не совпадет с именем потока
                wait();
            }
        } catch (InterruptedException e) {
            System.out.println("Прерывание wait");
        }

        try {
            result = br.readLine();
        } catch (IOException e) {
            System.out.println("Ошибка чтения");
        }
        if (status.equals("first")) { //переключаем статус
            status = "second";
        } else {
            status = "first";
        }
        notify(); //уведомляем другой поток
        return result;
    }
}
