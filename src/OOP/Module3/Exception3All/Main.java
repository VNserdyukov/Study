package OOP.Module3.Exception3All;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int element = scan.nextInt();
        while (element != ) {
            try {
            element = scan.nextInt();
        }
        int [] mas = new int[0];
        try {
            mas = new int[scan.nextInt()];
        } catch (InputMismatchException ex) {
            System.out.println("Размер массива должен быть целым числом!");
        } catch (NegativeArraySizeException e) {
            System.out.println("Введите положительный размер массива");
        }
        scan.next();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = scan.nextInt();
        }
        int index = scan.nextInt();
        System.out.println("Извлечено из массива: " + mas[index]);
        System.out.println(Arrays.toString(mas));
    }
}
