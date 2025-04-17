package Module2;

import java.util.Scanner;

public class Lesson26Break05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dan1 = scan.nextInt();
        int dan2 = scan.nextInt();
        int sum = 0;
        for (int i = dan1; i <= dan2; i++) {
            for (int j = 2; j <= dan2; j++) {
                if (i % j == 0) {
                    sum += j;
                    break;
                }
            }
        }
        System.out.println(sum);
    }
}