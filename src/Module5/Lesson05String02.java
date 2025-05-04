package Module5;

import java.util.Scanner;

public class Lesson05String02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String changed = a.replace(";", ".,");
        int find = a.indexOf("@");
        System.out.println(changed);
        System.out.println(find);
    }
}
