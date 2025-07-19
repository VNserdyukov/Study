package OOP.Module5.Singleton;

import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        CelestialBody[] bodies = new CelestialBody[6];
        for (int i = 0; i < bodies.length; i++) {
            bodies[i] = initCelestialBody();
        }
        if (bodies[0] == bodies[3] && bodies[1] == bodies[2] && bodies[4] == bodies[5]) {
            System.out.println("Ok");
        } else {
            System.out.println("Error");
        }
    }

    public static CelestialBody initCelestialBody() {
        String buffer = scan.next();
        return switch (buffer) {
            case "Sun" -> Sun.getInstance();
            case "Moon" -> Moon.getInstance();
            case "Earth" -> Earth.getInstance();
            default -> null;
        };
    }
}