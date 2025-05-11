package JavaCore.Module3;

import java.util.Scanner;

public class Lesson03Metod07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        double z = scan.nextDouble();
        System.out.printf("%.2f %.2f\n", average(a, b), average(a, b, c));
        System.out.printf("%.2f %.2f\n", average(x, y),average(x, y, z));
    }

    static double average (double x, double y, double z) {
        return (x + y + z) / 3;
    }

    static double average (double x, double y) {
        return (x + y) / 2;
    }

    // Без последних двух методов можно обойтись, т.к. фактические параметры типа int
    // могут расширяться до типа double в формальных параметрах методов.

    static double average (int a, int b) {
        return (double) (a + b) / 2;
    }

    static double average (int a, int b, int c) {
        return (double) (a + b + c) / 3;
    }
}

