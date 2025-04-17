package Module2;

import java.util.Scanner;

public class Lesson26Break04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dan = scan.nextInt();
        int sum = 0;
        for (int i = 2; i < dan; i++) {
            if (i % 2 != 0) continue;
            if (dan % i == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}