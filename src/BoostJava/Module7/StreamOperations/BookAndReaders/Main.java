package BoostJava.Module7.StreamOperations.BookAndReaders;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Reader> readers = new ArrayList<>();
        String line;

        while (!"end".equals(line = scan.nextLine())) {
            String[] parts = line.split(" ");
            Reader reader = new Reader(parts[0]);
            for (int i = 0; i < Integer.parseInt(parts[1]); i++) {
                String bookData = scan.nextLine();
                String[] split = bookData.split(";");
                Book book = new Book(Integer.parseInt(split[0]), split[1], split[2]);
                reader.addBook(book);
            }
            readers.add(reader);
        }

        readers.stream().flatMap(reader -> reader.getBooks().stream())
                .sorted(Comparator.comparingInt(Book::getNumber))
                .forEach(System.out::println);

    }
}

