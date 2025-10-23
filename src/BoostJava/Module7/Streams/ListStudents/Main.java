package BoostJava.Module7.Streams.ListStudents;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        String line;

        while (!"end".equals(line = scan.nextLine())) {
            String[] parts = line.split(" +");
            Student student = new Student(parts[0], parts[1], Integer.parseInt(parts[2]));
            students.add(student);
        }

        Map<String, Student> studentMap = students.stream()
                .collect(Collectors.toMap(Student::getGruppa,
                        Function.identity(), BinaryOperator.maxBy(Comparator.comparingInt(Student::getAge))));

        studentMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));

//        Map<String, Optional<Student>> map = students.stream()
//                .collect(Collectors.groupingBy(Student::getGruppa,
//                        Collectors.maxBy(Comparator.comparingInt(Student::getAge))));
//
//        map.entrySet().stream()
//                .sorted(Map.Entry.comparingByKey())
//                .forEach(pair -> System.out.println(pair.getKey() + ":" + pair.getValue().get()));
    }
}
