package OOP.Module2.Interface2Transport;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mas = scan.nextInt();
        Transport[] transports = new Transport[mas];
        for (int i = 0; i < transports.length; i++) {
            int type = scan.nextInt();
            double maxWeight = scan.nextDouble();
            switch (type) {
                case 1:
                    transports[i] = new Lorry(maxWeight);
                    break;
                case 2:
                    transports[i] = new Ship(maxWeight);
                    break;
            }
        }
        double weight = scan.nextDouble();

        for (Transport transport : transports) {
            if (transport.canCarry(weight)) {
                transport.add(weight);
            }
        }

        for (Transport transport : transports) {
            System.out.println(transport);
        }
    }
}
