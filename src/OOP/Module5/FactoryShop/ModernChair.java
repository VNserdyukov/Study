package OOP.Module5.FactoryShop;

public class ModernChair implements Chair {
    @Override
    public String description() {
        return "Кресло в стиле Модерн";
    }

    @Override
    public int getCost() {
        return 20;
    }
}
