package JavaCore.Module4;

import java.util.Random;
import java.util.Scanner;

public class Lesson44Massive04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] mas = new int[scan.nextInt()][scan.nextInt()];
        long seed = scan.nextLong();
        int ind = scan.nextInt();
        initArray(mas, seed);
        printArray(mas);
        System.out.println();
        mas = deleteRow(mas, ind);
        printArray(mas);
    }

    public static void initArray(int[][] mas, long seed) {
        Random rand = new Random(seed);
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = rand.nextInt(11);
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

    public static int[][] deleteRow(int[][] mas, int a) {
        if (a < 0 || a >= mas.length) {
            return mas;
        }
        int[][] newmas = new int[mas.length - 1][mas[0].length];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                newmas[i][j] = mas[i][j];
            }
        }
        for (int i = a + 1; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                newmas[i - 1][j] = mas[i][j];
            }
        }
        return newmas;
    }

}

