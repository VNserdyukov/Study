package Module5;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson50String01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] nov = {scan.nextLine(), scan.nextLine(), scan.nextLine()};
        Arrays.sort(nov);
        for (String el:nov) {
            System.out.println(el);
        }
    }
}
