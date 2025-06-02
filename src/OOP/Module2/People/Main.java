package OOP.Module2.People;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int mas = scan.nextInt();
        Employee[] employee = new Employee[mas];
        for (int i = 0; i < employee.length; i++) {
            int type = scan.nextInt();
            String surname = scan.next();
            String gender = scan.next();
            int age = scan.nextInt();
            int salary = scan.nextInt();
            switch (type) {
                case 1:
                    employee[i] = new Employee(surname, gender, age, salary);
                    break;
                case 2:
                    employee[i] = new Programmer(surname, gender, age, salary, scan.next(), scan.next());
                    break;
                case 3:
                    employee[i] = new Accountant(surname, gender, age, salary, scan.next());
                    break;
            }
        }
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] instanceof Employee employee1) {
                employee1.show();
                continue;
            }
            if (employee[i] instanceof Programmer programmer1) {
                programmer1.show();
                continue;
            }
            if (employee[i] instanceof  Accountant accountant1) {
                accountant1.show();
            }
        }

        int sum = 0;
        for (Employee value : employee) {
            sum += value.getSalary();
        }
        System.out.println(sum);

        int max = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() > employee[max].getSalary()) {
                max = i;
            }
        }
        employee[max].show();

        System.out.println();
        boolean find = false;
        for (Employee value : employee) {
            if ((value instanceof Programmer programmer) && programmer.getSpecialization().equals("frontend")) {
                programmer.show();
                find = true;
            }
        }
        if (!find) {
            System.out.println("NO");
        }

    }
}

