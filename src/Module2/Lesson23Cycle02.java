package Module2;

import java.util.Scanner;

public class Lesson23Cycle02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dan1 = scan.nextInt();
        int dan2 = scan.nextInt();
        int dan3;
        double multi = 1.;
        dan3 = Math.max(dan1, dan2);
        dan2 = Math.min(dan1, dan2);
        while (dan2 <= dan3) {
            multi *= dan2;
            dan2++;
        }
        System.out.println(multi);
    }
}