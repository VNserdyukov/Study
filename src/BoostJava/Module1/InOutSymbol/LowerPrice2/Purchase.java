package BoostJava.Module1.InOutSymbol.LowerPrice2;

public class Purchase {
    private String name;
    private int price;
    private double quantity;

    public Purchase(String name, int price, double quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Purchase() {
    }

    double getCost() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return name + '#' + price + '#' + quantity;
    }
}
