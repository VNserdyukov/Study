package OOP.Module4.WrapperClass.Wrapper1Class;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            String s = scan.nextLine();
            String[] parts = s.split("(?=[-+*/%])|(?<=[-+*/%])");
            int num1 = Integer.parseInt(parts[0]);
            String operator = parts[1];
            int num2 = Integer.parseInt(parts[2]);
            if (parts.length > 3) {
                System.out.println("Error");
                return;
            }
            switch (operator) {
                case "+":
                    System.out.println(num1 + operator + num2 + "=" + (num1 + num2));
                    return;
                case "-":
                    System.out.println(num1 + operator + num2 + "=" + (num1 - num2));
                    return;
                case "*":
                    System.out.println(num1 + operator + num2 + "=" + (num1 * num2));
                    return;
                case "%":
                    System.out.println(num1 + operator + num2 + "=" + (num1 % num2));
                    return;
                case "/":
                    System.out.println(num1 + operator + num2 + "=" + (num1 / num2));
            }
        } catch (Exception exc) {
            System.out.println("Error");
        }
    }
}
