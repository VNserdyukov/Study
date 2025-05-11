package JavaCore.Module4;

import java.util.Random;
import java.util.Scanner;

public class Lesson44Massive01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] ar = new int[scan.nextInt()];
        long seed = scan.nextLong();
        init(ar,seed);
        print(ar);
        int ind = findMax(ar);
        System.out.println(ind);
    }

    public static void init(int[] mas, long seed) {
        Random rand = new Random(seed);
        for(int i = 0; i < mas.length; i++){
            mas[i] = rand.nextInt(-3, 6);
        }
    }

    public static void print(int[] mas) {
        for(int i = 0; i < mas.length; i++){
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

}
