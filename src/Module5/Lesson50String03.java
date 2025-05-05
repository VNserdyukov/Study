package Module5;

import java.util.Scanner;

public class Lesson50String03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        String str3 = scan.nextLine();
        String part1 = str1.substring(str1.indexOf(';') + 1, str1.lastIndexOf(';'));
        String part2 = str2.substring(str2.indexOf(';') + 1, str2.lastIndexOf(';'));
        String part3 = str3.substring(str3.indexOf(';') + 1, str3.lastIndexOf(';'));
        String result = part1 + part2 + part3;
        System.out.println(result);
    }
}
