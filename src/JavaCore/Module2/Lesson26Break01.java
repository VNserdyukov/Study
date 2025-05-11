package JavaCore.Module2;

import java.util.Scanner;

public class Lesson26Break01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dan = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= dan; i++) {
            if (dan % i == 0) {
                sum++;
            }
            if (sum > 2) {
                System.out.println("NO");
                break;
            }
        }
        if (sum == 2) {
            System.out.println("YES");
        }
    }
}