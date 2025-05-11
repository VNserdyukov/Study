package JavaCore.Module2;

import java.util.Scanner;

public class Lesson23Cycle01 {
    static final int N = 10;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kol = 0;
        int mark;
        int badmark = 0;
        while (kol < N) {
            mark = scan.nextInt();
            if (4 > mark) {
                badmark++;
            }
            kol++;
        }
        System.out.println(badmark);
    }
}