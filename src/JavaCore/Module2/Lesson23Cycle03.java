package JavaCore.Module2;

import java.util.Scanner;

public class Lesson23Cycle03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dan = scan.nextInt();
        int min = scan.nextInt();
        for (int i = 1; i < dan; i++) {
            int number = scan.nextInt();
            min = Math.min(number, min);
        }
        System.out.println(min);
    }
}