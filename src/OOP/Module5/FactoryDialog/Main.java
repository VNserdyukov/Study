package OOP.Module5.FactoryDialog;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String type = scan.nextLine();
        Dialog dialog = null;
        if ("Windows".equals(type)) {
            dialog = new WindowsDialog();
        } else if ("Html".equals(type)) {
            dialog = new HtmlDialog();
        } else {
            System.out.println("ERROR");
            return;
        }
        dialog.renderWindow();
    }
}
