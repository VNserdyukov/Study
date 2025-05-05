package Module5;

import java.util.Scanner;

public class Lesson50String05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(delCom(str));
        System.out.println(delComRegular(str));
    }

    public static String delCom (String a) {
        int ind = a.lastIndexOf(".com");
        if (ind == -1) return a;
        if (ind + ".com".length() != a.length()) return a;
        return a.substring(0, ind);
    }

    public static String delComRegular(String str) {
        return str.replaceAll("\\.com$", "");
    }

}
