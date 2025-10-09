package BoostJava.Module7.StreamOperations.CheckStatistics;

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        String line;

        while (!"end".equals(line = scan.nextLine())) {
            String[] parts = line.split(";");
            Student student = new Student(parts[0], Integer.parseInt(parts[1]), Double.parseDouble(parts[2]));
            students.add(student);
        }

        double averageAge = students.stream()
                .mapToInt(Student::getAge)
                .average()
                .orElse(20);
        System.out.print(Math.round(averageAge));

        double averageGradeMax = students.stream()
                .mapToDouble(Student::getAverageGrade)
                .max()
                .orElse(0.0);
        System.out.printf(" %.1f%n", averageGradeMax);

        String result = students.stream()
                .max(Comparator.comparingInt(s -> s.getName().length()))
                .map(Student::toString)
                .orElse("Empty data");
        System.out.println(result);
    }
}