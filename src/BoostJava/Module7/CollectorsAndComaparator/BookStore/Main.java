package BoostJava.Module7.CollectorsAndComaparator.BookStore;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Book> books = new ArrayList<>();
        String line;

        while (!"end".equals(line = scan.nextLine())) {
            String[] parts = line.split(";");
            Book book = new Book(Integer.parseInt(parts[0]), parts[1], Double.parseDouble(parts[2]));
            books.add(book);
        }

        Map<Integer, Book> result = books.stream()
                .collect(Collectors.toMap(Book::getId, b -> b));
        result.forEach((key, value) -> System.out.println(key + " = " + value));
    }
}
