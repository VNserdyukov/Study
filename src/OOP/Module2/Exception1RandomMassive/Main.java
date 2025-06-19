package OOP.Module2.Exception1RandomMassive;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random(scan.nextLong());
        int a = random.nextInt(-10,11);
        try {
            int[] mas = new int[a];
            for (int i = 0; i < mas.length; i++) {
                mas[i] = i;
            }
            System.out.println(Arrays.toString(mas));
        } catch (NegativeArraySizeException ex) {
            System.out.println("Неверный размер массива: " + a);
        }
    }
}
