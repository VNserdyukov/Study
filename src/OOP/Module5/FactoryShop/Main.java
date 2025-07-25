package OOP.Module5.FactoryShop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //определяемся со стилем мебели - создаем фабрику
        String style = scan.nextLine();
        FurnitureFactory factory = null;
        switch (style) {
            case "Модерн" -> factory = new ModernFurnitureFactory();
            case "Арт - деко" -> factory = new ArtDecoFurnitureFactory();
            case "Викторианский" -> factory = new VictorianFurnitureFactory();
            default -> {
                System.out.println("ERROR");
                return;
            }
        }

        //дальнейший код магазина не зависит от выбранного стиля
        int summa = 0;
        Chair chair = factory.createChair();
        Sofa sofa = factory.createSofa();
        CoffeeTable table = factory.createCoffeeTable();

        System.out.println("1- " + chair.description() + " стоимость: " + chair.getCost());
        System.out.println("2- " + sofa.description() + " стоимость: " + sofa.getCost());
        System.out.println("3- " + table.description() + " стоимость: " + table.getCost());
        System.out.println("Ваш выбор:");

        Cycl:
        do {
            int number = scan.nextInt();
            switch (number) {
                case 1 -> summa += chair.getCost();
                case 2 -> summa += sofa.getCost();
                case 3 -> summa += table.getCost();
                default -> {
                    break Cycl;
                }
            }
        } while (true);
        System.out.println("Общая стоимость Вашей покупки = " + summa);
    }
}
