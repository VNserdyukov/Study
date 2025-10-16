package BoostJava.Module7.StreamOperations.BookAndReaders;

import java.util.ArrayList;

public class Reader {
    private String surname;
    private ArrayList<Book> books;

    public Reader(String surname) {
        this.surname = surname;
    }

    public Reader(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
    }
}
