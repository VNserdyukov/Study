package BoostJava.Module3.Date.BetweenDates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String date1 = scan.nextLine();
        String date2 = scan.nextLine();
        SimpleDateFormat df = new SimpleDateFormat("MMM dd, yyyy", Locale.US);
        try {
            Date first = df.parse(date1);
            Date second = df.parse(date2);
            long dif = Math.abs(first.getTime() - second.getTime());
            long days = dif / 1000 / 60 / 60 / 24;
            long weeks = days / 7;
            System.out.println("Дней: " + days + " Недель: " + weeks);
        } catch (ParseException ex) {
            System.out.println("ERROR");
        }
    }
}