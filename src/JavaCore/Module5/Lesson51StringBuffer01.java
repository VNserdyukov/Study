package JavaCore.Module5;

import java.util.Scanner;

public class Lesson51StringBuffer01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String data = scan.nextLine().trim();
        String[] words = data.split(" +");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (word.contains("z")) {
                sb.append("ERROR").append(" ");
            } else {
                sb.append(word).append(" ");
            }
        }
        System.out.println(sb.toString().trim());
    }
}



