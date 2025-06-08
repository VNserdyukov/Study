package OOP.Module2.HomePet;

public class Cat extends Pet{
    private String color;

    //ПЕРЕОПРЕДЕЛЕНИЯ

    @Override
    void getNoise() {
        System.out.println("Мяу-мяу!");
    }

    @Override
    public String toString() {
        return super.toString() + ";" + color;
    }

    //КОНСТРУКТОРЫ

    public Cat() {
    }

    public Cat(String color) {
        this.color = color;
    }

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    //ГЕТТЕРЫ

    public String getColor() {
        return color;
    }

    //СЕТТЕРЫ

    public void setColor(String color) {
        this.color = color;
    }

}
