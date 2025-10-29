package BoostJava.Module3.Date.ConvertingNumbers;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        NumberFormat usNumber = NumberFormat.getNumberInstance(Locale.US);
        try {
            double result = usNumber.parse(input).doubleValue();
            System.out.println(result);
        } catch (ParseException ex) {
            System.out.println("ERROR");
        }
    }
}