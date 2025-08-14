package BoostJava.Module2.Set.System;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> names = new HashSet<>();
        String line = scanner.nextLine();
        while (!"end".equals(line)) {
            if (!names.contains(line)) {
                names.add(line);
                System.out.println("OK");
            } else {
                int i = 1;
                String newName = line + i;  // Первая попытка: name1
                while (names.contains(newName)) {
                    i++;
                    newName = line + i;     // Пробуем name2, name3, ...
                }
                names.add(newName);
                System.out.println(newName);
            }
            line = scanner.nextLine();
        }
        scanner.close();
    }
}
