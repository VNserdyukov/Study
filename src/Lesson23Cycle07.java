import java.util.Scanner;

public class Lesson23Cycle07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dan1 = scan.nextInt();
        int dan2 = scan.nextInt();
        int dan3 = Math.min(dan1, dan2);
        for (int i = 1; i <= dan3; i++) {
            if ((dan1 % i == 0) & (dan2 % i == 0)) {
                System.out.print(i + " ");
            }
        }
    }
}