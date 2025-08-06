package BoostJava.Module2.List.Abiturients;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Abiturient> abiturientList = new ArrayList<>();
        String line;

        try {
            while (!"end".equals(line = br.readLine())) {
                try {
                    String[] parts = line.split("#");
                    Abiturient abiturient = new Abiturient(parts[0], parts[1], Integer.parseInt(parts[2]),
                            Integer.parseInt(parts[3]), Integer.parseInt(parts[4]));
                    abiturientList.add(abiturient);
                } catch (Exception w) {

                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        if (abiturientList.isEmpty()) {
            System.out.println("Список пуст");
        }

        Collections.sort(abiturientList);
        for (Abiturient abiturient : abiturientList) {
            System.out.println(abiturient);
        }

        System.out.println();

        abiturientList.sort(new Comparator<Abiturient>() {
            @Override
            public int compare(Abiturient o1, Abiturient o2) {
                return Double.compare(o2.average(), o1.average());
            }
        });
        for (Abiturient abiturient : abiturientList) {
            System.out.println(abiturient);
        }
    }
}
