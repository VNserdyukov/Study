package OOP.Module4.StandartInterface.PurchaseTeacher;

public class Purchase implements Comparable<Purchase> {
    private String name;
    private int price;
    private int number;

    public Purchase(String name, int price, int number) {
        this.name = name;
        this.price = price;
        this.number = number;
    }

    public int getCost() {
        return price * number;
    }

    @Override
    public String toString() {
        return name + " " + price + " " + number + " " + getCost();
    }

    @Override
    public int compareTo(Purchase o) {
        return name.compareTo(o.name);
    }
}