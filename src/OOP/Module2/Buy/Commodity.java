package OOP.Module2.Buy;

import java.util.Objects;

public class Commodity {
    private String name;
    private int price;

    //КОНСТРУКТОРЫ

    public Commodity(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Commodity () {
    }

    //СЕТТЕРЫ

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //ГЕТТЕРЫ

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    //ПЕРЕОПРЕДЕЛЕНИЯ

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
        return name + ';' + price;
    }

    //МЕТОДЫ

    void show() {
        System.out.println("Наименование товара: " + name);
        System.out.println("Цена товара: " + price);
    }
}
