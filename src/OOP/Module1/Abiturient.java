package OOP.Module1;

public class Abiturient {
    String surname;
    String name;
    int math;
    int physics;
    int lang;

    double average() {
        return (math + physics + lang) / 3.;
    }

    void print() {
        System.out.printf("%s %s математика = %d физика = %d", surname, name, math, physics);
        System.out.printf(" язык = %d средний балл = %.1f", lang, average());
    }
}
