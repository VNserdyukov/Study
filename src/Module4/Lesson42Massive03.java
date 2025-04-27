package Module4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson42Massive03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[scan.nextInt()];
        Random rand = new Random(scan.nextLong());
        int inx1 = scan.nextInt();
        int inx2 = scan.nextInt();

        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(10, 21);
        }

        System.out.println(Arrays.toString(a));
        Arrays.sort(a, inx1, inx2 + 1);
        System.out.println(Arrays.toString(a));

    }
}