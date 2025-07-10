package OOP.Module4.Jeneric.Jeneric4Set;

public class MySet<E> {
    private E[] list;
    private int k; //индекс свободной ячейки

    public MySet() {
        list = (E[]) new Object[10];
        k = 0;
    }

    public MySet(int n) {
        list = (E[]) new Object[n];
        k = 0;
    }

    public void add(E elem) {
        if (k >= list.length) { //нет места
            E[] tmp = (E[]) new Object[list.length / 2 + list.length + 1]; //создаем новый массив и приводим к типу E[]
            for (int i = 0; i < list.length; i++) { //переписываем из исходного массива в новый
                tmp[i] = list[i];
            }
            list = tmp; //считаем новый массив текущим
        }
        list[k++] = elem; //записываем элемент и увеличиваем k в любом случае
    }

    public void print() {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
