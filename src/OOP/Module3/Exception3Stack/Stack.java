package OOP.Module3.Exception3Stack;

public class Stack {
    private char[] mas;
    private int index;

    public Stack(int n) {
        mas = new char[n];
        index = -1;
    }

    public void push(char c) throws StackException {
        if (index == mas.length - 1) throw new StackException("Стек заполнен!");
        mas[++index] = c;
    }

    public char pop() throws StackException {
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
