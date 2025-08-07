package BoostJava.Module2.List.Integers;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers = new ArrayList<>();
        String line;

        try {
            while (!"end".equals(line = br.readLine())) {
                try {
                    numbers.add(Integer.valueOf(line));
                } catch (Exception w) {

                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        if (numbers.isEmpty()) {
            System.out.println("List is empty");
        } else {
            numbers.set((numbers.size() / 2), (numbers.getFirst() + numbers.getLast()));
            System.out.println(numbers);
        }
    }
}

