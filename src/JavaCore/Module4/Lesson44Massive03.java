package JavaCore.Module4;

import java.util.Random;
import java.util.Scanner;

public class Lesson44Massive03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] ar = new int[scan.nextInt()];
        long seed = scan.nextLong();
        init(ar, seed);
        print(ar);
        int[] b = reduceAfterMax(ar);
        print(b);
    }

    public static void init(int[] mas, long seed) {
        Random rand = new Random(seed);
        for(int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt(-3, 6);
        }
    }

    public static void print(int[] mas) {
        for(int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }

    public static int findMax(int[] mas) {
        int max = 0;
        for(int i = 0; i < mas.length; i++) {
            if (mas[i] > mas[max]) {
                max = i;
            }
        }
        return max;
    }

    public static int[] reduceAfterMax(int[] mas) {
        int imax = findMax(mas);
        int[] b = new int[imax + 1];
        for(int i = 0; i <= imax; i++) {
            b[i] = mas[i];
        }
        return b;
    }

}
