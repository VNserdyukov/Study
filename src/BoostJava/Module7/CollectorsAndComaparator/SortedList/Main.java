package BoostJava.Module7.CollectorsAndComaparator.SortedList;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        String line;

        while (!"end".equals(line = scan.nextLine())) {
            String[] parts = line.split(" +");
            Employee employee = new Employee(parts[0], parts[1], Double.parseDouble(parts[2]));
            employees.add(employee);
        }

        employees.stream().sorted(Comparator.comparing(Employee::getDepartment)
                .thenComparingDouble(Employee::getSalary))
                .forEach(System.out::println);
    }
}
