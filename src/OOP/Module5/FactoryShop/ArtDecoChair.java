package OOP.Module5.FactoryShop;

public class ArtDecoChair implements Chair {
    @Override
    public String description() {
        return "Кресло в стиле Арт-деко";
    }

    @Override
    public int getCost() {
        return 50;
    }
}
