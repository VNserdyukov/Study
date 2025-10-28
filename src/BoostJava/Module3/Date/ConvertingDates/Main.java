package BoostJava.Module3.Date.ConvertingDates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        SimpleDateFormat inputFormat = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat outputFormat = new SimpleDateFormat("MM-dd-yyyy");
        try {
            Date date = inputFormat.parse(str);
            String result = outputFormat.format(date);
            System.out.println(result);
        } catch (ParseException ex) {
            System.out.println("ERROR");
        }
    }
}