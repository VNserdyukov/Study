package Module2;

import java.util.Scanner;

public class Lesson21Return03_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number > 1e6 || number < 99999) { //неверные исходные данные
            System.out.println("ERROR");
            return;
        }
        int summa1;
        int summa2 = 0;
        summa1 = number / 100000;
        summa1 += ((number / 10000) % 10);
        summa1 += ((number / 1000) % 10);
        summa2 += ((number / 100) % 10);
        summa2 += ((number / 10) % 10);
        summa2 += number % 10;
        if (summa1 == summa2) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}