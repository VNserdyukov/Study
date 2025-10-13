package BoostJava.Module7.StreamOperations.ConnectWords;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> words = new ArrayList<>();
        String line;

        while (!"end".equals(line = scan.nextLine())) {
            words.add(line);
        }
        Optional<String> result = words.stream()
                .reduce((x, y) -> x + " " + y);
        System.out.println(result.orElse("Empty data"));

        Optional<String> resultMin = words.stream().min(Comparator.comparingInt(String::length));
        System.out.println(resultMin.orElse("?"));
    }
}
