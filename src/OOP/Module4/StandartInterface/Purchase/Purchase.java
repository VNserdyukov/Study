package OOP.Module4.StandartInterface.Purchase;

public class Purchase implements Comparable<Purchase> {
    private String name;
    private int price;
    private int quantity;

    public Purchase() {
    }

    public Purchase(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getSumPrice() {
        return price * quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return name + " " + price + " " + quantity + " " + getSumPrice();
    }

    @Override
    public int compareTo(Purchase o) {
        if (getSumPrice() - o.getSumPrice() > 0) return 1;
        if (getSumPrice() - o.getSumPrice() < 0) return -1;
        return 0;
    }
}
