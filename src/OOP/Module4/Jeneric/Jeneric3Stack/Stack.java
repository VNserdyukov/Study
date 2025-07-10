package OOP.Module4.Jeneric.Jeneric3Stack;

public class Stack<E> {
    private E[] mas;
    private int index;

    public Stack(int n) {
        mas = (E[]) new Object[n];
        index = -1;
    }

    public void push(E elem) throws StackException {
        if (index == mas.length - 1) throw new StackException("Стек заполнен!");
        mas[++index] = elem;
    }

    public E pop() throws StackException {
        if (index == -1) throw new StackException("Попытка извлечь из пустого стека!");
        return mas[index--];
    }

    public void print() throws StackException {
        if (index == -1) throw new StackException("Стек пуст");
        for (int i = index; i >= 0; i--) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }

    public void clear() {
        index = -1;
    }
}
