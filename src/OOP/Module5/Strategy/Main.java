package OOP.Module5.Strategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();
        Message message = new Message(inputText);

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                message.setEditWay(new NoExtraSpaces());
                break;
            case 2:
                message.setEditWay(new NoDigits());
                break;
            case 3:
                message.setEditWay(new CapsFirstLetters());
                break;
            default:
                message.setEditWay(new NoEditing());
        }

        message.print();
    }
}