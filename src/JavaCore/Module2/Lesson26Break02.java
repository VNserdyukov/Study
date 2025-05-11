package JavaCore.Module2;

import java.util.Scanner;

public class Lesson26Break02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dan1 = scan.nextInt();
        int dan2 = scan.nextInt();
        int sum = 0;
        for (int i = dan1; i <= dan2; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    sum++;
                }
                if (sum > 2) {
                    break;
                }
            }
            if (sum == 2) {
                System.out.print(i + " ");
            }
            sum = 0;
        }
    }
}