package OOP.Module3.Exception1Guess;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random(scan.nextLong());
        int a = random.nextInt(1, 11);
        int[] mas = new int[a];
        for (int i = 0; i < 3; i++) {
            try {
                mas[scan.nextInt()] = scan.nextInt();
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Индекс не попал в массив");
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}

