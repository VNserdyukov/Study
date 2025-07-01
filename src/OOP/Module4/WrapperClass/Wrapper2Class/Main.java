package OOP.Module4.WrapperClass.Wrapper2Class;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String data = scan.nextLine();
        String[] mas = data.split("\\D+");
        int max = 0;
        for (String ma : mas) {
            if (ma.isEmpty()) continue;
            if (Integer.parseInt(ma) > max) {
                max = Integer.parseInt(ma);
            }
        }
        System.out.println(max);
    }
}
