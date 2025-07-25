package OOP.Module5.FactoryShop;

public class VictorianSofa implements Sofa {
    @Override
    public String description() {
        return "Диван в викторианском стиле";
    }

    @Override
    public int getCost() {
        return 110;
    }
}