package JavaCore.Module2;

import java.util.Scanner;

public class Lesson23Cycle05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dan1 = scan.nextInt();
        int dan2;
        int del = 0;
        do {
            dan2 = scan.nextInt();
            if (dan1 % dan2 == 0 && dan2 > 0) {
                del++;
            }
        } while (dan2 >= 0);
            System.out.println(del);
    }
}