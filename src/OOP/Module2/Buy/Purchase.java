package OOP.Module2.Buy;

import java.util.Objects;

public class Purchase {
    private Commodity commodity;
    private int amount;

    //КОНСТРУКТОРЫ

    public Purchase() {
    }

    public Purchase(Commodity commodity) {
        this.commodity = commodity;
    }

    public Purchase(Commodity commodity, int amount) {
        this.commodity = commodity;
        this.amount = amount;
    }

    //СЕТТЕРЫ

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setCommodity(Commodity commodity) {
        this.commodity = commodity;
    }

    //ГЕТТЕРЫ

    public int getAmount() {
        return amount;
    }

    public Commodity getCommodity() {
        return commodity;
    }

    //ПЕРЕОПРЕДЕЛЕНИЯ

    @Override
    public String toString() {
        return commodity + ";" + amount + ";" + getCost();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Purchase purchase)) return false;
        return Objects.equals(commodity, purchase.commodity);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(commodity);
    }

//МЕТОДЫ

    public int getCost() {
        return commodity.getPrice() * amount;
    }

}
