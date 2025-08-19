package BoostJava.Module2.Map.Reposts;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("\n");

        Map<String, Integer> depth = new HashMap<>();
        depth.put("Polycarp", 0);

        int maxDepth = 0;

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine(); // Приводим к нижнему регистру
            String[] parts = line.split(" +");
            String name1 = parts[0];
            String name2 = parts[2];

            int currentDepth = depth.get(name2) + 1;
            depth.put(name1, currentDepth);
            maxDepth = Math.max(maxDepth, currentDepth);
        }

        System.out.println(maxDepth);
    }
}
