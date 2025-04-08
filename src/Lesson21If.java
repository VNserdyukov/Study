import java.util.Scanner;

public class Lesson21If {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt(), num2 = scan.nextInt();
        int num3 = scan.nextInt(), num4 = scan.nextInt(), num5 = scan.nextInt(), num6 = scan.nextInt();
        double com1 = (double) (num1 + num2) / 2;
        double com2 = (double) (num3 + num4 + num5 + num6) / 4;
        if (com1 > com2) {
            System.out.println("First");
        }
        if (com1 < com2) {
            System.out.println("Second");
        }
        if (com1 == com2) {
            System.out.println("Draw");
        }
    }
}