import java.util.Scanner;

public class Training {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int number = scan.nextInt();
        int num1 = number / 100;
        int num2 = (number / 10) % 10;
        int num3 = number % 10;
        System.out.println(num1);
    }
}
