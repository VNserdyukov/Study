package Module2;

import java.util.Scanner;

public class Lesson25Cycle01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dan = scan.nextInt();
        for(int i = dan; i != 0; i--) { //меняется i - номер строки
            for(int j = 1; j <= i; j++) { //меняется j - номер столбца
                System.out.print(i);
            }
            System.out.println();
        }
    }
}