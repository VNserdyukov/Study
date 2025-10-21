package BoostJava.Module7.CollectorsAndComaparator.BookStore3;

import java.util.*;
import java.util.function.Function;
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
                .collect(Collectors.toMap(Book::getId, Function.identity()));

        result.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.naturalOrder()))
                .forEach(p -> System.out.println(p.getKey() + " : " + p.getValue()));
    }
}
