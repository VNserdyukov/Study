package OOP.Module1.Car;

import java.util.Calendar;

public class Car {
    private String brand;
    private String nameOwner;
    private double engine;
    private int yearOfMade;
    private static int yearNow;

    //СТАТИЧЕСКИЕ ПОЛЯ

    static {
        Calendar cal = Calendar.getInstance();
        yearNow = cal.get(Calendar.YEAR);
    }

    //КОНСТРУКТОРЫ

    public Car() {
    }

    public Car(String brand, String nameOwner, double engine, int yearOfMade) {
        this.brand = brand;
        this.nameOwner = nameOwner;
        this.engine = engine;
        this.yearOfMade = yearOfMade;
    }

    //СЕТТЕРЫ

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public void setYearOfMade(int yearOfMade) {
        this.yearOfMade = yearOfMade;
    }

    //ГЕТТЕРЫ

    public String getBrand() {
        return brand;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public double getEngine() {
        return engine;
    }

    public int getYearOfMade() {
        return yearOfMade;
    }

    public static int getYearNow() {
        return yearNow;
    }

    //МЕТОДЫ

    public int getLife() {
        return getYearNow() - yearOfMade;
    }

    //ПЕРЕОПРЕДЕЛЕНИЯ

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", owner='" + nameOwner + '\'' +
                ", volume=" + engine +
                ", yearOfMade=" + yearOfMade +
                '}';
    }
}
