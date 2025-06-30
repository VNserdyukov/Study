package OOP.Module4.Wrapper3Class;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String data = scan.nextLine();
        String[] mas = data.split("#");
        double sum = 0.0;
        for (String m : mas) {
            if (!m.isEmpty()) {
                try {
                    double num = Double.parseDouble(m);
                    sum += num;
                } catch (NumberFormatException ignore) {
                    //игнорируем не числовые значения
                }
            }
        }
        System.out.printf("%.1f", sum);
    }
}