import java.util.Scanner;

public class Lesson03Return {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int summa = 0;
        if (number < 0) number = -number;
        if (number < 100 || number > 999) { //неверные исходные данные
            System.out.println("ERROR");
            return;
        }
        int num1 = number / 100;
        int num2 = (number / 10) % 10;
        int num3 = number % 10;
        if (num1 % 2 == 1) summa += num1;
        if (num2 % 2 == 1) summa += num2;
        if (num3 % 2 == 1) summa += num3;
        if (summa == 0) {
            System.out.println("NO");
        }
        else {
            System.out.println(summa);
        }
    }
}