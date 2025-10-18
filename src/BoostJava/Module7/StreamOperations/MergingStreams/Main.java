package BoostJava.Module7.StreamOperations.MergingStreams;

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String data = scan.nextLine();
        String[] words = data.split(" +");
        data = scan.nextLine();
        String[] word2 = data.split(" +");
        Stream<String> one = Arrays.stream(words)
                .filter(s -> s.startsWith("a"));
        Stream<String> two = Arrays.stream(word2)
                .filter(s -> s.length() > 4)
                .map(s -> new StringBuilder(s).reverse().toString());
        Optional<String> result = Stream.concat(one, two).reduce((acc, el) -> acc + " " + el);
        System.out.println("|" + result.orElse("Empty result") + "|");
    }
}
