package Module4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson42Massive02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] a = new double[scan.nextInt()];
        Random rand = new Random(scan.nextLong());

        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextDouble(0., 2.);
        }

        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(a[0] + a[a.length - 1]);

    }
}