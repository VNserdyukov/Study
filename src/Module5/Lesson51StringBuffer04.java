package Module5;

import java.util.Scanner;

public class Lesson51StringBuffer04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String[] words = a.split("\\b");
        System.out.println(words);
    }

//    public static String primer(int a) {
//        StringBuilder sb = new StringBuilder();
//        sb.append(a).append(" + ").append(b).append(" = ").append(a + b);
//        return sb.toString();
//    }

}