package OOP.Module5.DekoratorEditing;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Message message = new Message(scan.nextLine());

        String type = scan.next();
        while (!"end".equals(type)) {
            switch (type) {
                case "Caps":
                    message = new CapitalLetters(message);
                    break;
                case "NoDigits":
                    message = new NoDigits(message);
                    break;
                case "NoExtraSpaces":
                    message = new NoExtraSpaces(message);
                    break;
            }
            type = scan.next();
        }

        System.out.println(message.getMessage());
    }
}