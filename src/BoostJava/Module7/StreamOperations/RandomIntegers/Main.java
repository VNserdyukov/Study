package BoostJava.Module7.StreamOperations.RandomIntegers;

import java.util.IntSummaryStatistics;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(scanner.nextLong());

        IntSummaryStatistics statistics = IntStream.generate(() -> random.nextInt(1001))
                .limit(10000)
                .summaryStatistics();
        System.out.println(statistics);
    }
}
