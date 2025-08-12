package BoostJava.Module2.Set.Diversity;

import java.util.Objects;

public class Product implements Comparable<Product> {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Product o) {
        int nameCompare = name.compareTo(o.name);
        if (nameCompare != 0) {
            return nameCompare;
        }
        return Integer.compare(price, o.price);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Product product)) return false;
        return price == product.price && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return name + ";" + price;
    }
}