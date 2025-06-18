package JavaCore;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Training {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = null;
        try {
            int n = scan.nextInt();
            array = new int[n];
            array[n] = n;
        } catch (NegativeArraySizeException ex) {
            System.out.println("Error1");
        } catch (InputMismatchException ex) {
            System.out.println("Error2");
        } catch (Exception ex) {
            System.out.println("Error3");
        }
    }
}
