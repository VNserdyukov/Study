package Module3;

import java.util.Scanner;

class Lesson03Metod02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int kol = simpleInRange(a, b);
        System.out.println(kol);
    }

    static int simpleInRange (int a, int b) {
        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        int sum = 0;
        while (a <= b) {
            if (Lesson03Metod01.isPrime(a)) {
                sum++;
            }
            a++;
        }
        return  sum;
    }

}
