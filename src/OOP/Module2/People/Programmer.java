package OOP.Module2.People;

public class Programmer extends Employee {
    private String status;
    private String specialization;

    //КОНСТРУКТОРЫ

    public Programmer() {
    }

    public Programmer(String surname, String gender, int age, int salary, String status, String specialization) {
        super(surname, gender, age, salary);
        this.status = status;
        this.specialization = specialization;
    }

    //СЕТТЕРЫ

    public void setStatus(String status) {
        this.status = status;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    //ГЕТТЕРЫ

    public String getStatus() {
        return status;
    }

    public String getSpecialization() {
        return specialization;
    }

    //ПЕРЕОПРЕДЕЛЕНИЯ

    @Override
    public void show() {
        System.out.println(getSurname() + ";" + getGender() + ";" + getAge() + ";" + getSalary() + ";" + status);
    }
}
