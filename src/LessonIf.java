import java.util.Scanner;

public class LessonIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number % 2 == 0) {
            System.out.println("YES");;
        } else {
            System.out.println("NO");;
        }
    }
}