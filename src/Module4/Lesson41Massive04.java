package Module4;

import java.util.Random;
import java.util.Scanner;

public class Lesson41Massive04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[scan.nextInt()];
        Random rand = new Random(scan.nextLong());

        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(-5, 16);
            System.out.print(a[i] + " ");
        }

        System.out.println();

        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > a[max]) {
                max = i;
            }
        }

        int min = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                min = i;
            }
        }

        if (a[min] < 0) {
            int tmp = a[max];
            a[max] = a[min];
            a[min] = tmp;
        }

        for (int el: a) {
            System.out.print(el + " ");
        }

    }
}






