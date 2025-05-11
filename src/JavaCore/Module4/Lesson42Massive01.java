package JavaCore.Module4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson42Massive01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[scan.nextInt()];
        Random rand = new Random(scan.nextLong());
        int kontrol = scan.nextInt();

        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(2, 16);
        }

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int kontrolEl = Arrays.binarySearch(a, kontrol);
        if (kontrolEl < 0) {
            System.out.println("ERROR");
        } else {
            int[] b = Arrays.copyOf(a, kontrolEl + 1);
            System.out.println(Arrays.toString(b));
        }

    }
}