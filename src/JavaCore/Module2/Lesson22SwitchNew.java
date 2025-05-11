package JavaCore.Module2;

import java.util.Scanner;

public class Lesson22SwitchNew {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();
        String result = switch (day) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> "ERROR";
        };
        System.out.println(result);
    }
}