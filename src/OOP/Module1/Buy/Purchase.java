package OOP.Module1.Buy;

public class Purchase {
    Commodity commodity;
    int amount;

    private int getCost() {
        return commodity.price * amount;
    }

    public void show() {
        commodity.show();
        System.out.println("Количество: " + amount);
        System.out.println("Стоимость покупки: " + getCost());
    }

}
