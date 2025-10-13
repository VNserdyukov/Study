package BoostJava.Module7.StreamOperations.Factorial;

import java.util.Scanner;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        long factorial = LongStream.rangeClosed(1, n)
                .reduce(1, (a, b) -> a * b);

        System.out.println(factorial);
    }
}
