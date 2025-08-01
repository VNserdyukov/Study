package BoostJava.Module1.InOutSymbol.EditingText;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader fr = new BufferedReader(
                new FileReader("./src/BoostJava/Module1/InOutSymbol/EditingText/data1.txt"));
             FileWriter fw = new FileWriter("./src/BoostJava/Module1/InOutSymbol/EditingText/data.txt")) {
            String str;
            StringBuilder result;
            while (fr.ready()) {
                str = fr.readLine();
                String[] words = str.split(" +");
                result = new StringBuilder();
                for (String item : words) {
                    if (!item.toLowerCase().contains("поток")) {
                        result.append(item).append(' ');
                    } else {
                        result.append("XXX").append(' ');
                    }
                }
                result.deleteCharAt(result.length() - 1);
                result.append("\r\n");
                fw.write(result.toString());
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
