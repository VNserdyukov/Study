package BoostJava.Module2.Map.HackerTeacher;

import java.util.*;

public class Main {
    static Map<String, String> map = new LinkedHashMap<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int number = scan.nextInt();
        scan.skip("\n");
        for (int i = 0; i < number; i++) {
            String oldName = scan.next();
            String newName = scan.next();
            scan.skip("\n");
            if (map.containsValue(oldName)) {
                oldName = findKey(oldName);
            }
            map.put(oldName, newName);
        }

        Set<Map.Entry<String, String>> set = map.entrySet();
        for (Map.Entry<String, String> item : set) {
            System.out.println(item.getKey() + " " + item.getValue());
        }
    }

    public static String findKey(String value) {
        Set<Map.Entry<String, String>> set = map.entrySet();
        for (Map.Entry<String, String> pair : set) {
            if (pair.getValue().equals(value)) {
                return pair.getKey();
            }
        }
        return null;
    }
}