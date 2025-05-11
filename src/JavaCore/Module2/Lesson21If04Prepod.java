package JavaCore.Module2;

import java.util.Scanner;

public class Lesson21If04Prepod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double ab,bc,weight;
        final double BAK = 300.;
        ab = scan.nextDouble();
        bc = scan.nextDouble();
        weight = scan.nextDouble();
        if (weight > 2000) {
            System.out.println("ERROR");
            return;
        }
        double rashod = 1;
        if (weight > 500 ) {
            rashod = 4;
        }
        if (weight > 1000) {
            rashod = 7;
        }
        if (weight > 1500) {
            rashod = 9;
        }
        double rashodAB = ab * rashod;
        double rashodBC = bc * rashod;
        if (rashodAB > BAK || rashodBC > BAK) {
            System.out.println("ERROR");
            return;
        }
        double ostatok = BAK - rashodAB;
        if (ostatok >= rashodBC) {
            System.out.println("0.00");
        } else {
            System.out.printf("%.2f" , rashodBC-ostatok);
        }
    }
}