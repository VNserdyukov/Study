import java.util.Scanner;

public class LessonIf02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        double w = scan.nextDouble();
        double z = scan.nextDouble();
        double d1 = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        double d2 = Math.sqrt(Math.pow(w,2) + Math.pow(z,2));
        if (d1 < d2) {
            System.out.println("Первая точка ближе");
        } else if (d1 == d2) {
            System.out.println("Точки на равных расстояниях");
        }
            else
                System.out.println("Вторая точка ближе");
            }
        }