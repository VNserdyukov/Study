package OOP.Module4.StandartInterface.Car;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Garage implements Iterable<Car> {
    private Car[] box;

    public Garage(int size) {
        box = new Car[size];
    }

    public Garage() {
    }

    public void putCar(Car unit, int i) throws ErrorBoxException {
        int index = i - 1;
        if (index < 0 || index >= box.length) throw new ErrorBoxException("ERROR");
        if (box[index] != null) throw  new ErrorBoxException("ERROR");
        box[index] = unit;
    }

    public Car getCar(int i) throws ErrorBoxException {
        int index = i - 1;
        if (index < 0 || index >= box.length) throw new ErrorBoxException("ERROR");
        if (box[index] != null) throw  new ErrorBoxException("ERROR");
        Car car = box[index];
        box[index] = null;
        return car;
    }

    public boolean isFree(int number) {
        int index = number - 1;
        if (index < 0 || index >= box.length) return false;
        return box[index] != null;
    }

    public int getFreeBoxNumber() {
        for (int i = box.length - 1; i >= 0; i--) {
            if (box[i] == null) {
                return i + 1;
            }
        }
        return -1;
    }

    @Override
    public Iterator<Car> iterator() {
        return new GarageIterator();
    }

    public  class GarageIterator implements Iterator<Car> {
        int count = box.length - 1;

        @Override
        public boolean hasNext() {
            return count >= 0;
        }

        @Override
        public Car next() {
            if (!hasNext()) throw new NoSuchElementException();
            return box[count--];
        }
    }
}
