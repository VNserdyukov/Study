package OOP.Module2.Car;

public class Truck extends Car {
    private double liftingCapacity;

    //КОНСТРУКТОРЫ

    public Truck() {
    }

    public Truck(String brand, String nameOwner, double engine, int yearOfMade, double liftingCapacity) {
        super(brand, nameOwner, engine, yearOfMade);
        this.liftingCapacity = liftingCapacity;
    }

    //СЕТТЕРЫ

    public void setLiftingCapacity(double liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }

    //ГЕТТЕРЫ

    public double getLiftingCapacity() {
        return liftingCapacity;
    }

    //МЕТОДЫ

    public boolean ifCanCarry(double weight){
        return liftingCapacity >= weight;
    }

    //ПЕРЕОПРЕДЕЛЕНИЯ

    @Override
    public String toString() {
        return "Truck{" +
                "brand='" + getBrand() + '\'' +
                ", owner='" + getNameOwner() + '\'' +
                ", volume=" + getEngine() +
                ", yearOfMade=" + getYearOfMade() +
                ", capacity=" + liftingCapacity + '}';
    }

}
