import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String month = scan.next();
        switch (month) {
            case "Декабрь", "Январь", "Февраль" -> System.out.println("Зима");
            case "Март", "Апрель", "Май" -> System.out.println("Весна");
            case "Июнь", "Июль", "Август" -> System.out.println("Лето");
            case "Сентябрь", "Октябрь", "Ноябрь" -> System.out.println("Осень");
            default -> System.out.println("Неверное название месяца!");
        }
    }
}