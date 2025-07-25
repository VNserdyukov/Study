package OOP.Module5.FactoryShop;

public class ArtDecoTable implements CoffeeTable {
    @Override
    public String description() {
        return "Столик в стиле Арт-деко";
    }

    @Override
    public int getCost() {
        return 65;
    }
}