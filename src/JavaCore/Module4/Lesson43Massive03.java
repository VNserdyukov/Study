package JavaCore.Module4;

import java.util.Random;
import java.util.Scanner;

public class Lesson43Massive03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] array = new int[scan.nextInt()][scan.nextInt()];
        Random rand = new Random(scan.nextLong());
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt(-10, 11);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        SECOND:
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0) {
                    System.out.println(j);
                    continue SECOND;
                }
            }
            System.out.println("NO");
        }

    }
}

