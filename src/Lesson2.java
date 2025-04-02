import java.util.Scanner;

    public class Lesson2{
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            double x = scan.nextDouble();
            x = Math.log(x + 7 * Math.sqrt(Math.pow(x,4) + Math.PI));
            System.out.printf("%.4f", x);
        }
    }

