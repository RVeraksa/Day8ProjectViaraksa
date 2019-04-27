package by.javatr.task1.library;

import by.javatr.task1.exception.BookExistException;
import by.javatr.task1.exception.BookListEmpthy;
import by.javatr.task1.exception.BookNotFoundException;
import by.javatr.task1.util.Book;
import java.util.ArrayList;

public class BookList implements Library {
    private ArrayList<Book> list;
    public BookList() {
        list = new ArrayList<Book>();
    }

    public String toString() {
        String temp = "";
        for (Book book : list) {
            temp += book.toString() + "\n";
        }
        return temp;
    }

    @Override
    public void addBook(Book book) throws BookExistException {
        if (list.contains(book)) throw new BookExistException(book.toString());
        list.add(book);
    }

    @Override
    public void removeBook(Book book) throws BookNotFoundException {
        if (!list.contains(book)) throw new BookNotFoundException(book.toString());
        list.remove(book);
    }


    public ArrayList<Book> getBookList() throws BookListEmpthy {
        if (list.isEmpty()) throw new BookListEmpthy("There are no books in your vault");
        return list;
    }

    public static LibraryFactory factory = new LibraryFactory() {
        @Override
        public Library getLibrary() {
            return new BookList();
        }
    };
}
