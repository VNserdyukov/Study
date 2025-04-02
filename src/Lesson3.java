import java.util.Scanner;

public class Lesson3{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double z = 2 * Math.pow(Math.sin(3 * Math.PI - 2 * a), 2) * Math.pow(Math.cos(5 * Math.PI + 2 * a), 2);
        double y = 1.0 / 4 - 1.0 / 4 * Math.sin((5 * Math.PI) / 2 - 8 * a);
        System.out.printf("%.5f %.5f", z, y);
    }
}
