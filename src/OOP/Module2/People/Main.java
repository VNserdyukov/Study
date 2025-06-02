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
                    //можно сканнер запустить в самом кейсе;
                    String gruppa = scan.next();
                    employee[i] = new Accountant(surname, gender, age, salary, gruppa.charAt(0));
                    break;
                default:
                    employee[i] = null;
            }
        }
        for (Employee value : employee) {
            if (value != null) {
                value.show();
            }
        }

        int sum = 0;
        int max = 0;
        for (int i = 0; i < employee.length; i++) {
            sum += employee[i].getSalary();
            if (employee[i].getSalary() > employee[max].getSalary()) {
                max = i;
            }
        }
        System.out.println(sum);
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

