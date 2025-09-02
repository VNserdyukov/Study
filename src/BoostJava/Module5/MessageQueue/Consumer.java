package BoostJava.Module5.MessageQueue;

public class Consumer implements Runnable {
    private MyQueue queue;

    public Consumer(MyQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String str = queue.get();
                System.out.println(str);
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                return; //завершение программы
            }
        }
    }
}