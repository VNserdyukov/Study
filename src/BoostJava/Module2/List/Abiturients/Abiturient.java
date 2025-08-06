package BoostJava.Module2.List.Abiturients;

public class Abiturient implements Comparable<Abiturient>{
    private String surname;
    private String name;
    private int grade1;
    private int grade2;
    private int grade3;

    public Abiturient(String surname, String name, int grade1, int grade2, int grade3) {
        this.surname = surname;
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    public Abiturient() {
    }

    public double average() {
        return (grade1 + grade2 + grade3) / 3.0;
    }

    @Override
    public String toString() {
        return surname + ';' + name + ';' + grade1 + ';' + grade2 + ';' +
                grade3 + ';' + String.format("%.1f", average());
    }

    @Override
    public int compareTo(Abiturient o) {
        int surnameCompare = this.surname.compareTo(o.surname);
        if (surnameCompare != 0) {
            return surnameCompare;
        }
        return this.name.compareTo(o.name);
    }
}
