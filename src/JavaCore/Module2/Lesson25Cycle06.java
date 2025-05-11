package JavaCore.Module2;

import java.util.Scanner;

public class Lesson25Cycle06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dan1 = scan.nextInt();
        int dan2 = scan.nextInt();
        int dan3 = Math.min(dan1, dan2);
        int dan4 = Math.max(dan1, dan2);
        int max1 = 0;
        int max2 = 0;
        int num = 0;
        for (int i = dan3; i <= dan4; i++) {
            for (int j = i; (j != 0); j /= 10) {
               max1 += j % 10;
            }
            if (Math.abs(max1) > Math.abs(max2)) {
                max2 = max1;
                num = i;
            }
            max1 = 0;
        }
        System.out.println(num);
    }
}