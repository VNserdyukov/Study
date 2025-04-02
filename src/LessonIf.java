import java.util.Scanner;

public class LessonIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите годовой доход в копейках: ");
        long income = scan.nextLong(); //для ввода дохода <=4 млрд.
        double tax;
        if (income / 100.0 <= 5e6) {
            tax = income * 0.13;
        } else {
            tax = income * 0.15;
        }
        long taxLong = (long)Math.ceil(tax);
        System.out.println("Налог= " + taxLong / 100 + " руб. " + taxLong % 100 + " коп.");
    }
}