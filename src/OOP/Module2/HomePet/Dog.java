package OOP.Module2.HomePet;

public class Dog extends Pet {
    public String breed;

    //ПЕРЕОПРЕДЕЛЕНИЯ

    @Override
    public String toString() {
        return super.toString() + ";" + breed;
    }

    @Override
    void getNoise() {
        System.out.println("Гав-гав!");
    }

    //КОНСТРУКТОРЫ

    public Dog() {
    }

    public Dog(String breed) {
        this.breed = breed;
    }

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    //СЕТТЕРЫ

    public void setBreed(String breed) {
        this.breed = breed;
    }

    //ГЕТТЕРЫ

    public String getBreed() {
        return breed;
    }

}
