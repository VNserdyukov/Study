package OOP.Module1.People;

public class Employee {
    String surname;
    String gender;
    int age;
    int salary;
    double koef;

    boolean isPensioner() {
        if (gender.equals("male") && age >= 63) return true;
        return gender.equals("female") && age >= 58;
    }

    void changeSalary(double koef) {
        salary = (int) (salary * koef);
    }

    void show() {
        System.out.println(surname + ";" + gender + ";" + age + ";" + salary);
    }
}
