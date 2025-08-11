package BoostJava.Module2.List.MyQueue2;

public class MyQueue<E> {
    private ListNode<E> begin = null;
    private ListNode<E> end = null;

    public MyQueue() {

    }

    public MyQueue(ListNode<E> begin, ListNode<E> end) {
        this.begin = begin;
        this.end = end;
    }

    public class ListNode<E> {
        private E val;
        private ListNode<E> next;

        ListNode() {
        }

        ListNode(E val) {
            this.val = val;
        }

        ListNode(E val, ListNode<E> next) {
            this.val = val;
            this.next = next;
        }
    }

    public void add(E el) { //добавляем в конец очереди
        ListNode<E> node = new ListNode<>(el, null); //создаем последний элемент с нулевой ссылкой
        if (end == null) { //список был пуст
            end = node; //обе ссылки на этот элемент
            begin = node;
            return;
        }
        end.next = node; //привязать элемент к списку
        end = node; //указатель конца передвинуть на новый элемент
    }

    public E get() {
        if (begin == null) return null; // если пустой список
        E tmp = begin.val; //делаем копию данных
        begin = begin.next; //начало - на следующий элемент
        //прежний первый элемент подберет сборщик мусора
        return tmp; //возвращаем данные из начала очереди
    }

    public void print() { //печать очереди от начала к концу
        if (begin == null) {
            System.out.println("Queue is empty");
            return;
        }
        ListNode item = begin;
        while (item != null) {
            System.out.print(item.val + " ");
            item = item.next; //переходим к следующему элементу
        }
        System.out.println();
    }

    public void clear() { //очистка очереди
        begin = null;
        end = null;
        //все элементы списка соберет сборщик мусора, поскольку к ним потерян доступ
    }

    public MyQueue<E> reverse() {
        MyQueue<E> reversedQueue = new MyQueue<>();
        ListNode<E> current = begin;
        ListNode<E> prev = null;
        ListNode<E> next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        reversedQueue.begin = end;
        reversedQueue.end = begin;
        return reversedQueue;
    }

    public int size() {
        int count = 0;
        ListNode<E> current = begin;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public E middleNode() {
        if (begin == null) {
            return null;
        }

        ListNode<E> slow = begin;
        ListNode<E> fast = begin;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.val;
    }
}
