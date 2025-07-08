package OOP.Module4.Jeneric.Jeneric2Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> studentYoung = new ArrayList<>();
        ArrayList<String> studentOld = new ArrayList<>();

        while (true) {
            String buffer = scan.nextLine();
            if (buffer.equals("end")) break;
            String[] parts = buffer.split(" ");
            double average = Double.parseDouble(parts[1]);
            int age = Integer.parseInt(parts[2]);
            Student student = new Student(parts[0], average, age);
            if (average >= 18)
        }
    }
}
