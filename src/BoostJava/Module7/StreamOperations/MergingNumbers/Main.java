package BoostJava.Module7.StreamOperations.MergingNumbers;

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line1 = scan.nextLine();
        String line2 = scan.nextLine();

        List<Integer> result = Stream.concat(
                Arrays.stream(line1.split(" +"))
                        .map(Integer::parseInt)
                        .filter(n -> n % 2 == 0),

                Arrays.stream(line2.split(" +"))
                        .map(Integer::parseInt)
                        .filter(Main::isPrime)
        ).toList();

        System.out.println(result);
    }

    public static boolean isPrime(int num) {
        int limit = (int) (Math.sqrt(num) + 1); //максимальное проверяемое число
        return num == 2 || num > 1 && IntStream.range(2, limit)
                .noneMatch(divisor -> num % divisor == 0);
    }
}