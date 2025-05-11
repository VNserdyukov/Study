package JavaCore.Module2;

import java.util.Scanner;

public class Lesson26Break03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dan1 = scan.nextInt();
        int dan2 = scan.nextInt();
        int dan3 = Math.min(dan1, dan2);
        int dan4 = Math.max(dan1, dan2);
        int sum = 0;
        for (int i = dan3; i <= dan4; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    sum++;
                }
                if (sum > 2) {
                    System.out.println(i);
                    break;
                }
            }
            if (sum <= 2) {
                sum = 0;
            } else {
                break;
            }
        }
        if (sum == 0) {
            System.out.println("NO");
        }
    }
}