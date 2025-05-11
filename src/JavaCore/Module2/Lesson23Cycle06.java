package JavaCore.Module2;

import java.util.Scanner;

public class Lesson23Cycle06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dan = scan.nextInt();
        int sum = 0;
        int kol = 0;
        do {
            sum += (dan % 10);
            dan = dan / 10;
            kol++;
        } while (dan != 0);
        System.out.println(kol + " " + Math.abs(sum));
    }
}