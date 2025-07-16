package OOP.Module4.StandartInterface.Range;

import java.util.Iterator;

public class Range implements Iterable<Integer>, Iterator<Integer> {
    private int start;
    private int end;
    private int count;

    public Range(int start, int end) {
        this.start = start;
        this.end = end;
        count = start;
    }

    @Override
    public Iterator<Integer> iterator() {
        return this;
    }

    @Override
    public boolean hasNext() {
        return count != end + 1;
    }

    @Override
    public Integer next() {
        return count++;
    }
}
