package OOP.Module4.StandartInterface.Car;

public class Car{
    private String brand;
    private double engine;

    public Car(String brand, double engine) {
        this.brand = brand;
        this.engine = engine;
    }

    public Car() {
    }

    @Override
    public String toString() {
        return brand + ';' + engine;
    }
}
