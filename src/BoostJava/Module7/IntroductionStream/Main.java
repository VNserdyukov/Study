package BoostJava.Module7.IntroductionStream;

import java.util.Scanner;
import java.util.Random;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long data = scan.nextLong();
        Random random = new Random(data);
        Stream.generate(() -> random.nextInt(10, 21))
                .limit(6)
                .forEach(n -> System.out.print(n + " "));
    }
}