package Module4;

import java.util.Random;
import java.util.Scanner;

public class Lesson43Massive01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] array = new int[scan.nextInt()][scan.nextInt()];
        Random rand = new Random(scan.nextLong());
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt(-5, 5);
                System.out.print(array[i][j] + "\t");
                max = Math.max(max, array[i][j]);
            }
            System.out.println();
        }

        int kol = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == max) {
                    kol++;
                }
            }
        }

        System.out.print(max + " " + kol);

    }
}
