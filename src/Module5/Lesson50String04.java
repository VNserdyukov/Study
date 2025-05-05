package Module5;

import java.util.Scanner;

public class Lesson50String04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if (isGMailAddress(str)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public  static boolean isGMailAddress (String a) {
        int ind = a.indexOf('@');
        if(ind == 0 ) return false;
        String sub = a.substring(ind);
        return sub.equals("@gmail.com");
    }

}
