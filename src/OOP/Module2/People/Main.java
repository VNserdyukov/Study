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
                case 2:
                    employee[i] = new Programmer(surname, gender, age, salary, scan.next(), scan.next());
                case 3:
                    employee[i] = new Accountant(surname, gender, age, salary, scan.next());
            }

            for (int j = 0; j < employee.length; j++) {
                if (employee[i] instanceof Employee employee1) {
                    employee1.show();
                }
                if (employee[i] instanceof Programmer programmer1) {
                    programmer1.show();
                }
            }

        }

    }
}
