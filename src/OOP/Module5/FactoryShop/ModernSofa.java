package OOP.Module5.FactoryShop;

public class ModernSofa implements Sofa {
    @Override
    public String description() {
        return "Диван в стиле Модерн";
    }

    @Override
    public int getCost() {
        return 80;
    }
}