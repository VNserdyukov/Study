package OOP.Module2.Interface1;

public class Cube implements IShape {
    private double side;

    //МЕТОДЫ

    @Override
    public double computeSquare() {
        return 6 * Math.pow(side, 2);
    }

    @Override
    public String toString() {
        return "Куб сторона = " + side;
    }

    //КОНСТРУКТОРЫ

    public Cube() {
    }

    public Cube(double side) {
        this.side = side;
    }

}
