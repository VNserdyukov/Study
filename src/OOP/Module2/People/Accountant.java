package OOP.Module2.People;

public class Accountant extends Employee{
    private char gruppa;

    //КОНСТРУТКОРЫ

    public Accountant() {
    }

    public Accountant(String surname, String gender, int age, int salary, char gruppa) {
        super(surname, gender, age, salary);
        this.gruppa = gruppa;
    }

    //СЕТТЕРЫ

    public void setGruppa(char gruppa) {
        this.gruppa = gruppa;
    }

    //ГЕТТЕРЫ

    public char getGruppa() {
        return gruppa;
    }

    //ПЕРЕОПРЕДЕЛЕНИЯ

    @Override
    public void show() {
        super.show();
        System.out.println(";" + gruppa);
    }
}
