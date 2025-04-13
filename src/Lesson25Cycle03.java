import java.util.Scanner;

public class Lesson25Cycle03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dan = scan.nextInt();
        if (dan <= 0) {
            System.out.println("ERROR");
            return;
        }
        for (int i = 1; i <= dan; i++) {
            for (int j = 1; j <= dan ; j++) {
                if (j < i) {
                    System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
            System.out.println();
            }
        }
    }

