package BoostJava.Module2.Map.Salary;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> salaryMap = new TreeMap<>();  // TreeMap вместо HashMap
        String line = scanner.nextLine();

        while (!line.equals("end")) {
            String[] parts = line.split(" ");
            String surname = parts[0];
            double amount = Double.parseDouble(parts[1]);

            if (salaryMap.containsKey(surname)) {
                amount += salaryMap.get(surname);
            }
            salaryMap.put(surname, amount);
            line = scanner.nextLine();
        }

        for (Map.Entry<String, Double> entry : salaryMap.entrySet()) {
            System.out.printf("%s %.2f%n", entry.getKey(), entry.getValue());
        }
    }
}