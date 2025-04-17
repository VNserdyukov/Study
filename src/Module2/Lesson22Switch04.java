package Module2;

import java.util.Scanner;

public class Lesson22Switch04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int zp = 50;
        final int shtraf = 20;
        int var = scan.nextInt();
        int dan1 = scan.nextInt();
        int dan2 = scan.nextInt();
        int sumshtraf = 0;
        int dohod = 0;
        int opoz;
        switch (var) {
            case 1:
                opoz = dan2 / 3;
                if (opoz > 0) {
                    sumshtraf = opoz * shtraf;
                }
                int stroki = (dan1 + sumshtraf) / zp;
                if ((dan1 + sumshtraf) % zp > 0) {
                    stroki++;
                }
                int minstrock = stroki * 100;
                System.out.println(minstrock);
                break;
            case 2:
                dohod = (dan1 / 100) * zp;
                if (dohod > dan2) {
                    opoz = (((dohod - dan2) / 20) * 3) + 2;
                    System.out.println(opoz);
                } else {
                    System.out.println("ERROR");
                }
                break;
            case 3:
                opoz = dan2 / 3;
                if (opoz > 0) {
                    sumshtraf = opoz * shtraf;
                }
                if ((dan1 / 100) > 0) {
                    dohod = ((dan1 / 100) * zp) - sumshtraf;
                } if (dohod > 0) {
                    System.out.println(dohod);
                } else {
                    System.out.println("0");
                }
                break;
            default:
                System.out.println("ERROR");
        }
    }
}