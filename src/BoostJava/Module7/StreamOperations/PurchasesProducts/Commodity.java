package BoostJava.Module7.StreamOperations.PurchasesProducts;

import java.util.Objects;

public class Commodity implements Comparable<Commodity> {
    private String name;
    private int price;

    public Commodity(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Commodity commodity)) return false;
        return price == commodity.price && Objects.equals(name, commodity.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return name + ";" + price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int compareTo(Commodity o) {
        return this.name.compareTo(o.name);
    }
}
