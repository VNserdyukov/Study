package BoostJava.Module2.Set.CountTeacher;

import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<String> set = new HashSet<>();
        String buffer = scan.nextLine();
        while (!buffer.equals("end")) {
            String[] fio = buffer.split(" +");
            set.add(fio[0]);
            buffer = scan.nextLine();
        }
        System.out.println(set.size());

    }
}
