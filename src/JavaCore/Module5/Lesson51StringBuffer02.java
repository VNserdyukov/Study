package JavaCore.Module5;

import java.util.Scanner;

public class Lesson51StringBuffer02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String data = scan.nextLine();
        String[] words = data.split(" +");
        StringBuilder sb = new StringBuilder(words[0]);
        while (data.length() != sb.length()) {
            for (int i = 1; i < words.length; i++) {
                if (sb.charAt(sb.length() - 1) == words[i].charAt(0)) {
                    sb.append(" ").append(words[i]);
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}



