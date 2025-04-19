package Module3;

import java.util.Scanner;

public class Lesson03Metod04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int max = maxNumberDivider(a, b);
        System.out.println(max);
    }

    static int simpleInRange (int a) {
        int del = 0;
        for (int i = 1; i <= a / 2; i++) {
            if (a % i == 0) {
                del++;
            }
        }
        return  del;
    }

    static int maxNumberDivider (int a, int b) {
        int tmp = 0;
        int max = 0;
        while (a <= b) {
            int del = simpleInRange(a);
            if (del > tmp) {
                tmp = del;
                max = a;
            }
            a++;
        }
        return  max;
    }

}

