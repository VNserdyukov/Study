package Module3;

import java.util.Scanner;

public class Lesson03Metod05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        String str = scan.next();
        char sim = str.charAt(0);
        printTriangle(a, sim);
    }

    static void printTriangle(int a, char sim) {
        if (a % 2 == 0) {
            printChet(a, sim);
        } else {
            printNeChet(a, sim);
        }
    }

    static void printChet(int a, char sim) {
        int probel = a / 2;
        int zvezd = 2;
        for (int i = 1; i <= a; i += 2) {
            for (int j = 1; j < probel; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= zvezd; j++) {
                System.out.print(sim);
            }
            System.out.println();
            probel--;
            zvezd += 2;
        }
    }

    static void printNeChet(int a, char sim) {
        int probel = a / 2;
        int zvezd = 1;
        for (int i = 1; i <= a; i += 2) {
            for (int j = 1; j <= probel; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= zvezd; j++) {
                System.out.print(sim);
            }
            System.out.println();
            probel--;
            zvezd += 2;
        }
    }

}






