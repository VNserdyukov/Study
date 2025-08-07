package BoostJava.Module2.List.Commodity;

public class Commodity implements Comparable<Commodity>{
    private String name;
    private int price;
    private String madeOf;

    public Commodity(String name, int price, String madeOf) {
        this.name = name;
        this.price = price;
        this.madeOf = madeOf;
    }

    public int getPrice() {
        return price;
    }

    public Commodity() {
    }

    @Override
    public String toString() {
        return name + ';' + price + ';' + madeOf;
    }

    @Override
    public int compareTo(Commodity o) {
        return this.name.compareTo(o.name);
    }
}
