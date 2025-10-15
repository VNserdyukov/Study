package BoostJava.Module7.StreamOperations.BookAndReaders;

public class Book {
    private int number;
    private String author;
    private String name;

    public Book(int number, String author, String name) {
        this.number = number;
        this.author = author;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return number + "#" + author + "#" + name;
    }
}
