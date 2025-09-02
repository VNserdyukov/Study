package BoostJava.Module5.MessageQueue;

import java.util.ArrayList;

public class MyQueue {
    private final int MAX_LEN = 5;
    private final ArrayList<String> queue = new ArrayList<>();

    public synchronized void put(String str) throws InterruptedException {
        while (queue.size() >= MAX_LEN) {
            wait();
        }
        queue.add(str);
        notifyAll();
    }

    public synchronized String get() throws InterruptedException {
        while (queue.isEmpty()) {
            wait();
        }
        String result = queue.remove(0);
        notifyAll();
        return result;
    }

    public synchronized ArrayList<String> getQueue() {
        return new ArrayList<>(queue);
    }
}

