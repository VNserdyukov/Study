package BoostJava.Module6.StandartFunctionalInterface.SupplierString;

import java.util.function.Supplier;

public class StringSupplier implements Supplier<String> {
    private static String[] arr;
    private int next;

    public StringSupplier(String input) {
        arr = input.split(" +");
        this.next = 0;
    }

    @Override
    public String get() {
        if (next < arr.length) return arr[next++];
        return "null";
    }
}
