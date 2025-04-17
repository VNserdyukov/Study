package Module2;

import java.util.Scanner;

public class Lesson23Cycle08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dan = scan.nextInt();
        int line = scan.nextInt();
        char sim = scan.next().charAt(0);
        int kol = 0;
        if (dan != 1 && dan != 2 || line < 0) {
            System.out.println("ERROR");
            return;
        }
        while (kol < line) {
            if (dan == 1) {
                System.out.println(sim);
            } else {
                System.out.print(sim);
            }
            kol++;
        }
    }
}