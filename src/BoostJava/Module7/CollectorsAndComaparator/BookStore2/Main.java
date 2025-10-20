package BoostJava.Module7.CollectorsAndComaparator.BookStore2;

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

        Map<Boolean, Long> result = books.stream()
                .collect(Collectors.partitioningBy(b -> b.getPrice() < 30, Collectors.counting()));
        System.out.println(result);
    }
}

