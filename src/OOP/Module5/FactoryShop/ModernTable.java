package OOP.Module5.FactoryShop;

public class ModernTable implements CoffeeTable {
    @Override
    public String description() {
        return "Столик в стиле Модерн";
    }

    @Override
    public int getCost() {
        return 10;
    }
}