package BoostJava.Module6.StandartFunctionalInterface.FactorialsMapping;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Map<Integer, Double> map = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        String data = scan.nextLine();
        while (!data.equals("end")) {
            String[] parts = data.split(" +");
            if (parts.length >= 2) {
                map.put(Integer.parseInt(parts[0]), Double.parseDouble(parts[1]));
            } else {
                map.computeIfAbsent(Integer.parseInt(parts[0]), k -> fact(k));
            }
            data = scan.nextLine();
        }
        map.forEach((k, v) -> System.out.println(k + ":" + v));
    }

    public static double fact(int n) {
        double result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}