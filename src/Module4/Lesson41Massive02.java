package Module4;

import java.util.Random;
import java.util.Scanner;

public class Lesson41Massive02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] a = new double[scan.nextInt()];
        Random rand = new Random(scan.nextLong());
        double sum = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextDouble(0., 5.);
            System.out.printf("%.2f" + " ", a[i]);
            sum += a[i];
        }

        double srednee = sum / a.length;

        System.out.println();
        System.out.printf("%.2f\n", srednee);

        for (double el : a) {
            System.out.printf("%.2f" + " ", Math.min(el, srednee));
        }

    }
}






