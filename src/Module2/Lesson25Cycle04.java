package Module2;

import java.util.Scanner;

public class Lesson25Cycle04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int height = scan.nextInt();
        if (height <= 0) {
            System.out.println("ERROR");
            return;
        }
        int probel = 0;
        int zvezd = height;
        for (int i = 1; i <= height; i += 2){
            for (int j = 1; j <= probel; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= zvezd; j++) {
                System.out.print('*');
            }
            System.out.println();
            probel++;
            zvezd -= 2;
        }
    }
}