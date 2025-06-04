package OOP.Module2.Study;

public abstract class Learner {
    private String name;
    private int grade1;
    private int grade2;

    //МЕТОДЫ

    public double averageGrade() {
        return (double) (grade1 * grade2) / 2;
    }

    public abstract int holidays();

    //ПЕРЕОПРЕДЕЛЕНИЯ

    @Override
    public String toString() {
        return name + ";" + grade1 + ";" + grade2;
    }

    //КОНСТРУКТОРЫ

    public Learner() {
    }

    public Learner(String name, int grade1, int grade2) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
    }

    //СЕТТЕРЫ

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade1(int grade1) {
        this.grade1 = grade1;
    }

    public void setGrade2(int grade2) {
        this.grade2 = grade2;
    }

    //ГЕТТЕРЫ

    public String getName() {
        return name;
    }

    public int getGrade1() {
        return grade1;
    }

    public int getGrade2() {
        return grade2;
    }
}
