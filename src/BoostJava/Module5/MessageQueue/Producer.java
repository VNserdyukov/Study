package BoostJava.Module5.MessageQueue;

import java.time.LocalTime;

public class Producer implements Runnable {
    private MyQueue queue;

    public Producer(MyQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                queue.put(LocalTime.now().toString());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                return; //завершение программы
            }
        }
    }
}