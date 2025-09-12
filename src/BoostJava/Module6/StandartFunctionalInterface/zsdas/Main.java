package BoostJava.Module6.StandartFunctionalInterface.zsdas;

import java.util.*;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Double> map = new TreeMap<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }

            String[] parts = input.split(" ");

            if (parts.length == 2) {
                // Случай с двумя числами: добавляем пару ключ-значение
                try {
                    int key = Integer.parseInt(parts[0]);
                    double value = Double.parseDouble(parts[1]);
                    map.put(key, value);
                } catch (NumberFormatException e) {
                    // Игнорируем некорректный ввод
                }
            } else if (parts.length == 1) {
                // Случай с одним числом: вычисляем факториал, если ключа нет
                try {
                    int key = Integer.parseInt(parts[0]);
                    if (key >= 0 && !map.containsKey(key)) {
                        map.computeIfAbsent(key, k -> factorial(k));
                    }
                } catch (NumberFormatException e) {
                    // Игнорируем некорректный ввод
                }
            }
        }

        // Вывод отображения
        for (Map.Entry<Integer, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        scanner.close();
    }

    // Метод для вычисления факториала
    private static double factorial(int n) {
        if (n == 0 || n == 1) {
            return 1.0;
        }
        double result = 1.0;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}