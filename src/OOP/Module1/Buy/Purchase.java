package OOP.Module1.Buy;

public class Purchase {
    String name;
    int amount;

    private int getCost(){
        return Commodity.price * amount;
    }

    public void show() {
        Commodity.show;
        System.out.println("Количество: " + amount);
        System.out.println("Стоимость покупки: " + getCost());
    }

}
