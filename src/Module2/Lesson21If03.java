package Module2;

import java.util.Scanner;

public class Lesson21If03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hours = scan.nextInt();
        double stav = scan.nextDouble();
        double zarp = 0;
        if (hours < 0 || stav < 0) { //неверные исходные данные
            System.out.println("ERROR");
            return;
        }
        if (hours <= 20) {
            zarp = hours * stav;
        }
        if (hours > 20 & hours <= 40) {
            zarp = (20 * stav) + ((hours - 20) * (stav * 1.5));
        }
        if (hours > 40) {
            zarp = (20 * stav) + (20 * (stav * 1.5)) + ((hours - 40) * (stav * 2));
        }
        System.out.printf("%.2f", zarp);
    }
}