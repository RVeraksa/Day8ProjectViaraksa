package by.javatr.task1.comparator;

import by.javatr.task1.util.Book;

import java.util.Comparator;

public class BookComparatorAuthor implements Comparator<Book> {

    @Override
    public int compare(Book b1, Book b2) {
        return b1.getAuthor().compareTo(b2.getAuthor());
    }
}
