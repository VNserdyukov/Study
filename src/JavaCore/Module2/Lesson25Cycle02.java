package JavaCore.Module2;

import java.util.Scanner;

public class Lesson25Cycle02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int vis = scan.nextInt();
        int shir = scan.nextInt();
        if (vis <= 0 || shir <= 0) {
            System.out.println("ERROR");
            return;
        }
        for (int i = 1; i <= vis; i++) {
            for (int j = 1; j <= shir; j++) {
                if (i > 1 && i < vis && j > 1 && j < shir) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
