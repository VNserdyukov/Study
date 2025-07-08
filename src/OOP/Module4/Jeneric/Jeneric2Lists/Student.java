package OOP.Module4.Jeneric.Jeneric2Lists;

public class Student {
    private String name;
    private double average;
    private int age;

    public Student() {
    }

    public Student(String name, double average, int age) {
        this.name = name;
        this.average = average;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ";" + average + ";" + age;
    }
}
