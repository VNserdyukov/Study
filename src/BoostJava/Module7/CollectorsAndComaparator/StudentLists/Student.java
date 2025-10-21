package BoostJava.Module7.CollectorsAndComaparator.StudentLists;

public class Student {
    private String name;
    private String gruppa;
    private int age;

    public Student(String name, String gruppa, int age) {
        this.name = name;
        this.gruppa = gruppa;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getGruppa() {
        return gruppa;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + ';' + age;
    }
}
