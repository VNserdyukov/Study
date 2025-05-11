package JavaCore.Module5;

import java.util.Scanner;

public class Lesson50String08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String stroka = scan.nextLine();
        System.out.println(zamena(stroka));
    }

    public static String zamena(String a) {
        String[] mas = a.split(" ");
        String newmas = "";
        for (String ma : mas) {
            String upper = ma.substring(0, 1).toUpperCase() + ma.substring(1) + " ";
            newmas += upper;
        }
        return newmas.trim();
    }

}


