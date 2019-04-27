package by.javatr.task1.comparator;

import by.javatr.task1.util.Book;

import java.util.Comparator;

public class BookComparatorPrice implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        Double p1 = new Double(b1.getPrice());
        Double p2 = new Double(b2.getPrice());
        return p1.compareTo(p2);
    }
}
