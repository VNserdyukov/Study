package OOP.Module4.StandartInterface.Range;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Range reverse = new Range(scan.nextInt(), scan.nextInt());
        for (Integer item : reverse) {
            System.out.print(item + " ");
        }
    }
}