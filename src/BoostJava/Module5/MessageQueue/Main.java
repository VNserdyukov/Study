package BoostJava.Module5.MessageQueue;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);
        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);
        t1.start();
        t2.start();
        try {
            Thread.sleep(30000);
            t1.interrupt();
            t2.interrupt();
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Прерывание в main");
        }
        System.out.println("The work finished");
        System.out.println("The queue:");
        ArrayList<String> list = queue.getQueue();
        for(String item:list){
            System.out.println(item);
        }
    }
}
