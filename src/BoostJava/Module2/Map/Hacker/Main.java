package BoostJava.Module2.Map.Hacker;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(reader.readLine());
        List<String[]> queries = new ArrayList<>();
        Map<String, String> next = new HashMap<>();
        Map<String, String> prev = new HashMap<>();

        for (int i = 0; i < q; i++) {
            String[] parts = reader.readLine().split(" ");
            String oldName = parts[0];
            String newName = parts[1];
            queries.add(new String[]{oldName, newName});
            next.put(oldName, newName);
            prev.put(newName, oldName);
        }

        List<String[]> result = new ArrayList<>();
        for (String[] query : queries) {
            String oldName = query[0];
            if (!prev.containsKey(oldName)) {
                String current = oldName;
                while (next.containsKey(current)) {
                    current = next.get(current);
                }
                result.add(new String[]{oldName, current});
            }
        }

        System.out.println(result.size());
        for (String[] pair : result) {
            System.out.println(pair[0] + " " + pair[1]);
        }
    }
}