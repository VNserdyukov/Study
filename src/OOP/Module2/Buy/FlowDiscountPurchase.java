package OOP.Module2.Buy;

public class FlowDiscountPurchase extends Purchase{
    private static double discount;
    private static int minAmount;

    static {
        discount = FixDiscountPurchase.getDiscount();
    }

    //КОНСТРУКТОРЫ

    public FlowDiscountPurchase() {
    }

    public FlowDiscountPurchase(Commodity commodity, int amount) {
        super(commodity, amount);
    }

    //СЕТТЕРЫ

    public static void setDiscount(double discount) {
        FlowDiscountPurchase.discount = discount;
    }

    public static void setMinAmount(int minAmount) {
        FlowDiscountPurchase.minAmount = minAmount;
    }

    //ГЕТТЕРЫ

    public static double getDiscount() {
        return discount;
    }

    public static int getMinAmount() {
        return minAmount;
    }

    //ПЕРЕОПРЕДЕЛЕНИЯ


    @Override
    public int getCost() {
        if (getAmount() >= minAmount) {
        return (int) (super.getCost() * discount);
        } else {
            return getCost();
        }
    }

    @Override
    public String toString() {
        return getCommodity() + ";" + getAmount() + ";" + discount + ";" + minAmount + ";" + getCost();
    }

}
