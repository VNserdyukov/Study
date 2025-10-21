package BoostJava.Module7.CollectorsAndComaparator.StudentLists;

import java.util.*;
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

        Map<String, List<Student>>  studentMap = students.stream()
                .collect(Collectors.groupingBy(Student::getGruppa));
        studentMap.forEach((k,v) -> System.out.println(k + ":\n" + v));
    }
}
