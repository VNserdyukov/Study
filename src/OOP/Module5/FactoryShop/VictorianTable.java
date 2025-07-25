package OOP.Module5.FactoryShop;

public class VictorianTable implements CoffeeTable {
    @Override
    public String description() {
        return "Столик в викторианском стиле";
    }

    @Override
    public int getCost() {
        return 70;
    }
}
