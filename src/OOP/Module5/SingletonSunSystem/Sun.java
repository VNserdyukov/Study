package OOP.Module5.SingletonSunSystem;

public class Sun implements CelestialBody {
    private static volatile Sun sun;

    private Sun() {
    }

    public static Sun getInstance() {
        if (sun == null) {
            synchronized (Sun.class) {
                if (sun == null) {
                    sun = new Sun();
                }
            }
        }
        return sun;
    }
}
