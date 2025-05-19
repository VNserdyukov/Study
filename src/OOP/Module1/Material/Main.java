package OOP.Module1.Material;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Material Стальной_Провод = new Material("steel", 7850);
        Thing thing = new Thing("wire", Стальной_Провод, 0.03);
        thing.show();
        Material Медный_Провод = new Material("cooper", 8500);
        thing.setMaterial(Медный_Провод);
        thing.setVolume(scan.nextDouble());
        thing.show();
    }
}
