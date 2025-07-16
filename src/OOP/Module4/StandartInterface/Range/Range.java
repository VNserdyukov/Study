package OOP.Module4.StandartInterface.Range;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Range implements Iterable<Integer> {
    private int start;
    private int end;

    public Range(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public Range() {
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RangeIterator();
    }

    public class RangeIterator implements Iterator<Integer> {
        int next = start;

        @Override
        public boolean hasNext() {
            return next <= end;
        }

        @Override
        public Integer next() {
            if (!hasNext()) throw new NoSuchElementException();
            return next++;
        }
    }
}
