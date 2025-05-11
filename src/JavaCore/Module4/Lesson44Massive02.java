package JavaCore.Module4;

import java.util.Random;
import java.util.Scanner;

public class Lesson44Massive02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] mas = new int[scan.nextInt()][scan.nextInt()];
        long seed = scan.nextLong();
        initArray(mas, seed);
        printArray(mas);
        System.out.println();
        printMaxIndex(mas);
    }

    public static void initArray(int[][] mas, long seed) {
        Random rand = new Random(seed);
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = rand.nextInt(0, 11);
            }
        }
    }

    public static void printArray(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void printMaxIndex(int[][] mas) {
        for (int[] ma : mas) {
            System.out.print(Lesson44Massive01.findMax(ma) + " ");
        }
    }

}
