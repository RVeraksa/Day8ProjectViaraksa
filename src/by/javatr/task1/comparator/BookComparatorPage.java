package by.javatr.task1.comparator;

import by.javatr.task1.util.Book;

import java.util.Comparator;

public class BookComparatorPage implements Comparator<Book> {

    @Override
    public int compare(Book b1, Book b2) {
        Integer p1 = new Integer(b1.getPages());
        Integer p2 = new Integer(b2.getPages());
        return p1.compareTo(p2);
    }
}
