package OOP.Module5.FactoryShop;

public class VictorianChair implements Chair {
    @Override
    public String description() {
        return "Кресло в викторианском стиле";
    }

    @Override
    public int getCost() {
        return 80;
    }
}
