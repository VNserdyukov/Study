package BoostJava.Module3.Date.ConvertingNumbers;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String number = scan.nextLine();
        NumberFormat inputFormat = NumberFormat.getInstance(Locale.forLanguageTag("ru-RU"));
        NumberFormat outputFormat = NumberFormat.getInstance(Locale.US);
        try {
            double n = inputFormat.parse(number).doubleValue();
            System.out.printf(outputFormat.format(n));
        } catch (ParseException ex) {
            System.out.println("ERROR");
        }
    }
}