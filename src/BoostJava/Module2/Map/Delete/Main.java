package BoostJava.Module2.Map.Delete;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> surnameToEmployee = new HashMap<>(); // Для проверки уникальности фамилий
        Map<String, String> uniqueEmployees = new TreeMap<>();   // Для хранения уникальных и сортировки
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] parts = input.split(" +");
            if (parts.length != 2) {
                continue;
            }
            String surname = parts[0];

            if (!surnameToEmployee.containsKey(surname)) {
                surnameToEmployee.put(surname, input);
                uniqueEmployees.put(surname, input);
            } else {
                uniqueEmployees.remove(surname);
            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, String> entry : uniqueEmployees.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}