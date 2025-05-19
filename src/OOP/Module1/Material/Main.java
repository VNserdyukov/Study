package OOP.Module1.Material;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Thing thing = new Thing("wire", new Material("steel", 7850), 0.03);
        thing.show();
        Material copper = new Material("copper", 8500);
        thing.setMaterial(copper);
        thing.setVolume(scan.nextDouble());
        thing.show();
    }
}
