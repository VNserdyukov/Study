import java.util.Scanner;

public class Lesson25Cycle05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dan = scan.nextInt();
        for(int i = 1; i <= dan; i++) {
            for(int j = 1; j <= dan; j++) {
                System.out.printf("%d\t", i * j);
            }
            System.out.println();
        }
    }
}