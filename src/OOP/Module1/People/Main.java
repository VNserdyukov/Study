package OOP.Module1.People;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int mas = scan.nextInt();
        if (mas < 0) {
            System.out.println("ERROR");
            return;
        }

        Employee[] worker = new Employee[mas];
        for (int i = 0; i < worker.length; i++) {
            worker[i] = new Employee(scan.next(), scan.next(), scan.nextInt(), scan.nextInt());
            if (worker[i].isPensioner()) {
                worker[i].setSalary(90000);
            }
        }

        for (Employee person:worker) {
            if (person != null) {
                person.show();
            }
        }

    }
}
