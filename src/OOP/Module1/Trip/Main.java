package OOP.Module1.Trip;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int mas = scan.nextInt();
        if (mas < 0) {
            System.out.println("ERROR");
            return;
        }

        BusinessTrip[] workers = new BusinessTrip[mas];
        for (int i = 0; i < workers.length - 1; i++) {
            workers[i] = new BusinessTrip(scan.next(), scan.nextInt(), scan.nextInt());
        }
        workers[workers.length - 1] = new BusinessTrip(workers[0]);
        workers[0].setName(scan.next());
        for (BusinessTrip worker : workers) {
            System.out.println(worker);
        }

        int index = scan.nextInt();
        for (BusinessTrip worker : workers) {
            if (worker.equals(workers[index])) {
                System.out.println(worker);
            }
        }

    }
}
