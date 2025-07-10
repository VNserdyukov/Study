package OOP.Module4.Jeneric.Jeneric3Stack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<Student> massive = new Stack<>(10);

        while (true) {
            try {
                String buffer = scan.nextLine();
                if (buffer.equals("Конец")) break;
                String[] parts = buffer.split(" ");
                double average = Double.parseDouble(parts[1]);
                int age = Integer.parseInt(parts[2]);
                massive.push(new Student(parts[0], average, age));
            } catch (StackException e) {
                System.out.println(e.getMessage());
            } catch (Exception ex) {
                System.out.println("Некорректный ввод данных");
            }
        }

        try {
            massive.print();
        } catch (StackException e) {
            System.out.println(e.getMessage());
        }

    }
}


