package BoostJava.Module2.List.PriorityQueue;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Service> requests = new ArrayList<>();
        String line;

        try {
            while (!"end".equals(line = br.readLine())) {
                String[] parts = line.split(" +");
                String name = parts[0];
                int priority = Integer.parseInt(parts[1]);
                requests.add(new Service(name, priority));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        requests.sort(new Comparator<Service>() {
            @Override
            public int compare(Service r1, Service r2) {
                // Сначала сравниваем приоритеты в обратном порядке (убывание)
                if (r1.getPriority() != r2.getPriority()) {
                    return Integer.compare(r2.getPriority(), r1.getPriority());
                }
                // Если приоритеты равны, сравниваем порядок поступления (возрастание)
                return Integer.compare(r1.getOrder(), r2.getOrder());
            }
        });

        for (Service request : requests) {
            System.out.println(request.getName() + " " + request.getPriority());
        }
    }
}
