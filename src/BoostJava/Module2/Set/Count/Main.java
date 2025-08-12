package BoostJava.Module2.Set.Count;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> surnames = new HashSet<>();
        String line;

        try {
            while (!"end".equals(line = br.readLine())) {
                String[] parts = line.split(" +");
                String surname = parts[0];
                String name = parts[1];
                surnames.add(String.valueOf(new Surname(surname, name)));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println(surnames.size());
    }
}
