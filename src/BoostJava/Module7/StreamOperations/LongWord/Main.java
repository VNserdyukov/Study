package BoostJava.Module7.StreamOperations.LongWord;

import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String data = scan.nextLine();

        String result = Arrays.stream(data.split(" "))
                .filter(word -> word.length() > 5)
                .findFirst()
                .orElse("No");

        System.out.println(result);
    }
}
