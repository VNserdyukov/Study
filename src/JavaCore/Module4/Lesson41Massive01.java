package JavaCore.Module4;

import java.util.Random;
import java.util.Scanner;

public class Lesson41Massive01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[scan.nextInt()];
        Random rand = new Random(scan.nextLong());
        int sum = 0;
        double proiz = 1;

        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(-5, 6);
            System.out.print(a[i] + " ");
            if (a[i] < 0) {
                proiz *= a[i];
            } else {
                sum += a[i];
            }
        }

        System.out.println();
        System.out.println(sum + " " + proiz);

    }
}






