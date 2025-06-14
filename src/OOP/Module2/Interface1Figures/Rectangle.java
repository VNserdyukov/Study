package OOP.Module2.Interface1Figures;

public class Rectangle implements IShape {
    private double side1;
    private double side2;

    //МЕТОДЫ

    @Override
    public double computeSquare() {
        return side1 * side2;
    }

    @Override
    public String toString() {
        return "Прямоугольник сторона 1 = " + side1 + ", сторона 2 = " + side2;
    }

    //КОНСТРУКТОРЫ

    public Rectangle() {
    }

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

}
