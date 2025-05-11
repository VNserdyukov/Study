package JavaCore.Module4;

import java.util.Scanner;

public class Lesson41Massive03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[scan.nextInt()];
        int imin = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
            if (a[i] <= a[imin]) {
                imin = i;
            }
        }

        a[imin] = -1;

        for (int el: a) {
            System.out.print(el + " ");
        }

    }
}






