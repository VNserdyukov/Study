package BoostJava.Module1.PathsFilesPath;

import java.io.File;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        File currentDir = new File(".");
        File[] data = currentDir.listFiles();

        if (data == null) {
            System.err.println("Error: Directory not found or cannot be read.");
            System.exit(1); // Завершаем программу с кодом ошибки
        }
        Arrays.sort(data);
        for (File file : data) {
            System.out.println(file.getName());
        }
    }
}
