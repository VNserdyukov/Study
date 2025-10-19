package BoostJava.Module7.StreamOperations.MergingNumbersTeach;

import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String data = scan.nextLine();
        String[] parts = data.split(" +");
        Stream<Integer> one = Arrays.stream(parts)
                .mapToInt(Integer::parseInt)
                .filter(i -> i % 2 == 0)
                .boxed();
        data = scan.nextLine();
        parts = data.split(" +");
        Stream<Integer> two = Arrays.stream(parts)
                .mapToInt(Integer::parseInt)
                .filter(Main::isPrime)
                .boxed();

        List<Integer> list = Stream.concat(one, two)
                .collect(Collectors.toList());
        System.out.println(list);

    }

    static boolean isPrime(int n) {
        int limit = (int) (Math.sqrt(n) + 1);
        return n == 2 || n > 1 && IntStream.range(2, limit)
                .noneMatch(divisor -> n % divisor == 0);
    }
}