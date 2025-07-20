package OOP.Module5.SingletonSunSystem;

public class Earth implements CelestialBody {
    private static volatile Earth earth;

    private Earth() {
    }

    public static Earth getInstance() {
        if (earth == null) {
            synchronized (Earth.class) {
                if (earth == null) {
                    earth = new Earth();
                }
            }
        }
        return earth;
    }
}
