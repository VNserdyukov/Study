package BoostJava.Module2.List.MyQueue;

import java.util.LinkedList;

public class  MyQueue<E> {
    private LinkedList<E> list = new LinkedList<>();

    public void add(E el) {
        list.addLast(el); //добавляем в конец очереди
    }

    public E get() {
        return list.pollFirst(); //извлекаем из начала
    }

    public void print() { //печать очереди от начала к концу
        if (list.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        for (E item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public void clear() { //очистка очереди
        list.clear();
    }

    public MyQueue<E> reverse() {
        MyQueue<E> reversedQueue = new MyQueue<>();
        for (E item : list) {
            reversedQueue.list.addFirst(item); // вставка в начало
        }
        return reversedQueue;
    }

    public MyQueue<E> reverse(int start, int finish) {
        if (start <= 0 || finish <= 0 || start > list.size() || finish > list.size()) {
            return null;
        }

        int s = Math.min(start, finish) - 1;
        int f = Math.max(start, finish) - 1;

        MyQueue<E> newQueue = new MyQueue<>();
        LinkedList<E> temp = new LinkedList<>(list);

        while (s < f) {
            E tmp = temp.get(s);
            temp.set(s, temp.get(f));
            temp.set(f, tmp);
            s++;
            f--;
        }

        for (E item : temp) {
            newQueue.add(item);
        }

        return newQueue;
    }

    public E middleNode() {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() / 2);
    }
}
