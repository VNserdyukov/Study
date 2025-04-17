package Module2;

import java.util.Scanner;

public class Lesson21If02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt(), num2 = scan.nextInt();
        int num3 = scan.nextInt(), num4 = scan.nextInt(), num5 = scan.nextInt();
        int min = num1;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        if (num4 < min) {
            min = num4;
        }
        if (num5 < min) {
            min = num5;
        }
        System.out.println(min);
    }
}