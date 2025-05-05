package Module5;

import java.util.Scanner;

public class Lesson05String06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        System.out.println(max(a));
    }

    public static String max(String a) {
        String[] mas = a.split(" +");
        String word = "";
        for (String el:mas) {
            if (word.length() < el.length()) {
                word = el;
            }
        }
        return word;
    }

}

