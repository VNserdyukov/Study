package OOP.Module1.Buy;

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
    public String toString() {
        return name + ';' + price;
    }

    //МЕТОДЫ

    void show() {
        System.out.println("Наименование товара: " + name);
        System.out.println("Цена товара: " + price);
    }
}
