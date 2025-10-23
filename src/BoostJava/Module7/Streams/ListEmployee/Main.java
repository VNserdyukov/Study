package BoostJava.Module7.Streams.ListEmployee;

import java.util.*;
import java.util.stream.Collectors;

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

        Map<String, Optional<Employee>> map = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));

        map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(p -> System.out.println(p.getKey() + " : " + p.getValue().get()));
    }
}
