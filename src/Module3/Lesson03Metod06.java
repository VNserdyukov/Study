package Module3;

import java.util.Scanner;

public class Lesson03Metod06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();

        switch (count) {
            case (1):
                double a = scan.nextDouble();
                System.out.printf("%.2f", square(a));
                break;
            case (2):
                double b = scan.nextDouble();
                double c = scan.nextDouble();
                System.out.printf("%.2f", square(b, c));
                break;
        }
    }

    static double square(double y) {
        return y * y;
    }

    static double square(double y, double z) {
        return y * z;
    }

}






