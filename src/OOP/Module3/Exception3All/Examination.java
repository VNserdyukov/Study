package OOP.Module3.Exception3All;

import OOP.Module3.Exception2Weight.HeavyLuggageException;

public class Examination {
    private final int size;

    public Examination(int size) {
        this.size = size;
    }

    public void checkSize(int size) throws MassiveException {
        if (size < 0) {
            throw new MassiveException("Введите положительный размер массива");
        }

        System.out.println("Допустимый вес багажа");
    }
}

