package BoostJava.Module2.Set.Define;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> words = new HashSet<>();
        String line = scanner.nextLine();
        while (!line.equals("end")) {
            line = line.replaceAll("[^a-zA-Zа-яА-Я]", " ");
            String[] lineWords = line.split(" +");

            for (String word : lineWords) {
                if (!word.isEmpty()) {
                    words.add(word);
                }
            }

            line = scanner.nextLine();
        }

        List<String> sortedWords = new ArrayList<>(words);
        Collections.sort(sortedWords, Collections.reverseOrder());

        for (String word : sortedWords) {
            System.out.println(word);
        }
    }
}