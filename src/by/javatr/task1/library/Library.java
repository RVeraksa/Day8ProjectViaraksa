package by.javatr.task1.library;

import by.javatr.task1.exception.BookExistException;
import by.javatr.task1.exception.BookListEmpthy;
import by.javatr.task1.exception.BookNotFoundException;
import by.javatr.task1.util.Book;

import java.util.ArrayList;

public interface Library {
    void addBook(Book book) throws BookExistException;
    void removeBook(Book book) throws BookNotFoundException;
    ArrayList<Book> getBookList() throws BookListEmpthy;
}
