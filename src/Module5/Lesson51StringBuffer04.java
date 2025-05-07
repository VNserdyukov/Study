package Module5;

import java.util.Scanner;

public class Lesson51StringBuffer04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String[] words = a.split("\\D+");
        if (words.length < 1) {
            System.out.println("ERROR");
            return;
        }
        StringBuilder sbwords = new StringBuilder();
        for (String el:words) {
            sbwords.append(el);
        }

        String b = sbwords.toString();
        String[] numbers = b.split("");
        StringBuilder sbnums = new StringBuilder();
        int sum = 0;
        for (String elnum : numbers) {
            sbnums.append(elnum).append("+");
            sum += Integer.parseInt(elnum);
        }
        sbnums.deleteCharAt(sbnums.length() - 1);
        System.out.println(sbnums + "=" + sum);
    }
}

//        for (int i = 0; i < str.length(); i++) {
//        if (str.charAt(i) >= '0' &&  str.charAt(i) <= '9'){
//        summa += str.charAt(i) - '0';
//        result.append(str.charAt(i)).append('+');
//          }
//        }
//        if (!result.isEmpty()) {
//        result.replace(result.length() - 1, result.length(), "=");
//        result.append(summa);
//            System.out.println(result);
//        } else {
//            System.out.println("ERROR");
//          }
//        }