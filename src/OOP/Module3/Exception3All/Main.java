package OOP.Module3.Exception3All;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] mas = null;
        boolean isValidInput = true;

        while (isValidInput) {
            try {
                int number = scan.nextInt();
                mas = new int[number];
                isValidInput = false;
            } catch (NegativeArraySizeException e) {
                System.out.println("Введите положительный размер массива!");
            } catch (InputMismatchException ex) {
                System.out.println("Размер массива должен быть целым числом!");
                scan.next(); //очистка буфера
            }
        }
        for (int i = 0; i < mas.length; i++) {
            try {
                mas[i] = scan.nextInt();
            } catch (InputMismatchException exc) {
                mas[i] = 0;
                scan.next(); //очистка буфера
            }
        }
        try {
            int index = scan.nextInt();
            System.out.println("Извлечено из массива: " + mas[index]);
        } catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
            System.out.println("Неверный индекс!");
        }
        System.out.println(Arrays.toString(mas));
    }
}
