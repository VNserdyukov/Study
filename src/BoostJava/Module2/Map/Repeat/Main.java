package BoostJava.Module2.Map.Repeat;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> freq = new HashMap<>();

        while (sc.hasNext()) {
            String token = sc.next();
            if (token.equals("end")) break;

            int num = Integer.parseInt(token);
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        int answer = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();

            if (count > maxFreq || (count == maxFreq && num < answer)) {
                maxFreq = count;
                answer = num;
            }
        }
        System.out.println(answer);
    }
}
