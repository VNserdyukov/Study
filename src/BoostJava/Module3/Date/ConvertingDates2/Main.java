package BoostJava.Module3.Date.ConvertingDates2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        SimpleDateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat outputFormat = new SimpleDateFormat("MMMM dd, yyyy", Locale.US);
        try {
            inputFormat.setLenient(false);
            Date date = inputFormat.parse(input);
            String result = outputFormat.format(date);
            System.out.println(result);
        } catch (ParseException ex) {
            System.out.println("ERROR");
        }
    }
}