package Module2;

import java.util.Scanner;

public class Lesson21If04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ab = scan.nextInt();
        int bc = scan.nextInt();
        int ves = scan.nextInt();
        int bak = 300;
        int zapravka;
        if (ves > 2000) {
            System.out.println("ERROR");
            return;
            } else if (ves <= 500 & (ab > bak || bc > bak)) {
                System.out.println("ERROR");
                return;
                    } else if ((ves > 500 & ves <= 1000) & (ab > (bak / 4) || bc > (bak / 4))) {
                    System.out.println("ERROR");
                    return;
                        } else if ((ves > 1000 & ves <= 1500) & (ab > (bak / 7) || bc > (bak / 7))) {
                        System.out.println("ERROR");
                        return;
                            } else if ((ves < 2000 & ves >= 1500) & (ab > (bak / 9) || bc > (bak / 9))) {
                            System.out.println("ERROR");
                            return;
        }
        if (ves <= 500) {
            zapravka = bc - (bak -ab);
            } else if (ves <= 1000) {
                zapravka = 4 * (bc - ((bak / 4) - ab));
                } else if (ves <= 1500) {
                    zapravka = 7 * (bc - ((bak / 7) - ab));
                    } else {
                        zapravka = 9 * (bc - ((bak / 9) - ab));
        }
        if (zapravka < 0) {
            zapravka = 0;
        }
        System.out.printf("%.2f", (double)zapravka);
    }
}