package OOP.Module5.SingletonSunSystem;

public class Moon implements CelestialBody {
    private static volatile Moon moon;

    private Moon() {
    }

    public static Moon getInstance() {
        if (moon == null) {
            synchronized (Moon.class) {
                if (moon == null) {
                    moon = new Moon();
                }
            }
        }
        return moon;
    }
}
