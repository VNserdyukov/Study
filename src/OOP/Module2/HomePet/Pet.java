package OOP.Module2.HomePet;

public abstract class Pet {
    private String name;
    private int age;

    //МЕТОДЫ

    abstract void getNoise();

    //ПЕРЕОПРЕДЕЛЕНИЯ

    @Override
    public String toString() {
        return name + ";" + age;
    }

    //КОСТРУКТОРЫ

    public Pet() {
    }

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //СЕТТЕРЫ

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //ГЕТТЕРЫ

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
