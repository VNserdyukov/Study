package OOP.Module1.People;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        Employee worker = new Employee();
        worker.surname = scan.next();
        worker.gender = scan.next();
        worker.age = scan.nextInt();
        worker.salary = scan.nextInt();
        worker.koef = 0.9;
        if (worker.isPensioner()) {
            worker.changeSalary(worker.koef);
        }
        worker.show();
    }
}
