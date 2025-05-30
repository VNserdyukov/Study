package OOP.Module2.People;

public class Employee {
    private String surname;
    private String gender;
    private int age;
    private int salary;
    private double koef;

    //КОНСТРУКТОРЫ

    public Employee() {
    }

    public Employee(String surname, String gender, int age, int salary) {
        this.surname = surname;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
    }

    //СЕТТЕРЫ

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setKoef(double koef) {
        this.koef = koef;
    }

    //ГЕТТЕРЫ

    public String getSurname() {
        return surname;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public double getKoef() {
        return koef;
    }

    //МЕТОДЫ

    boolean isPensioner() {
        if (gender.equals("male") && age >= 63) return true;
        return gender.equals("female") && age >= 58;
    }

    void changeSalary(double koef) {
        salary = (int) (salary * koef);
    }

    public void show() {
        System.out.println(surname + ";" + gender + ';' + age + ";" + salary);
    }
}

