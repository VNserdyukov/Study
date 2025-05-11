package JavaCore.Module5;

import java.util.Scanner;

public class Lesson50String07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String stroka = scan.nextLine();
        String word = scan.nextLine();
        System.out.println(del(stroka, word).trim());
    }

    public static String del(String a, String b) {
        String[] mas = a.split(" +");
        String result = "";
        for (String el : mas) {
            if (!el.equals(b)) {
                result += el;
                result += " ";
            }
        }
        return result;
    }
}
    /*
    public static void regular(String a, String regex) {
        // Удаляем контрольное слово с помощью регулярного выражения
        String mas = a.replaceAll("\\b" + regex + "\\b", "");
        // Формируем массив строк с одним пробелом с помощью регулярного выражения
        String[] strFin = mas.split("\\s+");
        // Формируем строку без пробелов из массива строк
        String resultFinal = String.join(" ", strFin);
        // Убираем пробелы ДО и ПОСЛЕ строки
        resultFinal = resultFinal.strip();
        // Выводим строку на консоль
        System.out.println(resultFinal);
        */




