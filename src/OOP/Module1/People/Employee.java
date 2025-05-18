package OOP.Module1.People;

public class Employee {
    private String surname;
    private String gender;
    private int age;
    private int salary;
    private double koef;

    public Employee(String surname, String gender, int age, int salary) {
        this.surname = surname;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    boolean isPensioner() {
        if (gender.equals("male") && age >= 63) return true;
        return gender.equals("female") && age >= 58;
    }

    void changeSalary(double koef) {
        salary = (int) (salary * koef);
    }

    void show() {
        System.out.println(surname + ";" + gender + ';' + age + ";" + salary);
    }
}
