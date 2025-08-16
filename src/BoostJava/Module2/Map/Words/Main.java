package BoostJava.Module2.Map.Words;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        String line = scanner.nextLine().trim();

        while (!line.equals("end")) {
            line = line.replaceAll("[^a-zA-Zа-яА-Я]", " ");
            String[] words = line.split("\\s+");
            for (String word : words) {
                if (!word.isEmpty()) {
                    map.put(word, map.getOrDefault(word, 0) + 1);
                }
            }
            line = scanner.nextLine();
        }

        TreeMap<String, Integer> sortedWords = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                int countCompare = map.get(b).compareTo(map.get(a));
                if (countCompare != 0) {
                    return countCompare;
                } else {
                    return a.compareTo(b);
                }
            }
        });

        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if (o2.getValue() == o1.getValue()) {
                    return o1.getKey().compareTo(o2.getKey());
                } else {
                    return o2.getValue() - o1.getValue();
                }
            }
        });
        for (int i = 0; i < 10; i++) {
            System.out.println(list.get(i).getKey() + " " + list.get(i).getValue());
        }
    }
}