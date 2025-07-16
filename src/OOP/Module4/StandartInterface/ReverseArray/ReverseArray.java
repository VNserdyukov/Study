package OOP.Module4.StandartInterface.ReverseArray;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ReverseArray implements Iterable<Integer>, Iterator<Integer> {
    private int [] mas;
    private int count;

    public ReverseArray(int[] mas) {
        this.mas = mas;
        count = mas.length - 1;
    }

    @Override
    public Iterator<Integer> iterator() {
        return this;
    }

    @Override
    public boolean hasNext() {
        return count >= 0;
    }

    @Override
    public Integer next() {
        if (!hasNext()) throw  new NoSuchElementException();
        return mas[count--];
    }
}
