package OOP.Module1.Trip;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        BusinessTrip worker = new BusinessTrip();
        worker.name = scan.nextLine();
        worker.days = scan.nextInt();
        worker.expenses = scan.nextInt();
        worker.show();
    }
}
