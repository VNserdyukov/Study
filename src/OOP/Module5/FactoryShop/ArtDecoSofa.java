package OOP.Module5.FactoryShop;

public class ArtDecoSofa implements Sofa {
    @Override
    public String description() {
        return "Диван в стиле Арт-деко";
    }

    @Override
    public int getCost() {
        return 90;
    }
}
