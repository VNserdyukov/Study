package OOP.Module2.Buy;

public class FixDiscountPurchase extends Purchase{
    private static double discount;

    //КОНСТРУКТОРЫ

    public FixDiscountPurchase() {
    }

    public FixDiscountPurchase(Commodity commodity, int amount) {
        super(commodity, amount);
    }

    //СЕТТЕРЫ

    public static void setDiscount(double discount) {
        FixDiscountPurchase.discount = discount;
    }

    //ГЕТТЕРЫ

    public static double getDiscount() {
        return discount;
    }

    //ПЕРЕОПРЕДЕЛЕНИЯ


    @Override
    public int getCost() {
        return (int) (super.getCost() * discount);
    }

    @Override
    public String toString() {
        return getCommodity() + ";" + getAmount() + ";" + discount + ";" + getCost();
    }
}
