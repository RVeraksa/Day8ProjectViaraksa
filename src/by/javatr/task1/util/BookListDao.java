package by.javatr.task1.util;

import by.javatr.task1.comparator.BookComparatorAuthor;
import by.javatr.task1.comparator.BookComparatorPage;
import by.javatr.task1.comparator.BookComparatorPrice;
import by.javatr.task1.comparator.BookComparatorTitle;
import by.javatr.task1.exception.BookExistException;
import by.javatr.task1.exception.BookInitializationException;
import by.javatr.task1.exception.BookListEmpthy;
import by.javatr.task1.exception.BookNotFoundException;
import by.javatr.task1.library.Library;
import by.javatr.task1.library.LibraryFactory;

public class BookListDao {
    Library bookList;
    public BookListDao(LibraryFactory libraryFactory){
        this.bookList = libraryFactory.getLibrary();
    }

    public void addBook(Book book) throws BookExistException {
        bookList.addBook(book);
    }

    public void removeBook(Book book) throws BookNotFoundException {
        bookList.removeBook(book);
    }

    public void sort(BookField bookField) throws BookListEmpthy {
        switch (bookField){
            case TITLE:
                bookList.getBookList().sort(new BookComparatorTitle());
                break;
            case AUTHOR:
                bookList.getBookList().sort(new BookComparatorAuthor());
                break;
            case PAGE:
                bookList.getBookList().sort(new BookComparatorPage());
                break;
            case PRICE:
                bookList.getBookList().sort(new BookComparatorPrice());
                break;
                
        }
    }
    
    public <T> Book findBook(BookField bookField, T v) throws BookListEmpthy, BookInitializationException, BookNotFoundException {
        Book b = null;
        switch (bookField){
            case AUTHOR:
                for (Book book : bookList.getBookList()){
                    if (book.getAuthor().equalsIgnoreCase((String) v)){
                        return book;
                    }
                }
                break;
            case TITLE:
                for (Book book : bookList.getBookList()){
                    if (book.getTitle().equalsIgnoreCase((String) v)){
                        return book;
                    }
                }
                break;
            case PRICE:
                for (Book book : bookList.getBookList()){
                    if ((Double.compare(book.getPrice(),(Double) v))== 0){
                        return book;
                    }
                }
                break;
            case PAGE:
                for (Book book : bookList.getBookList()){
                    if (book.getPages() == (Integer) v){
                        return book;
                    }
                }
                break;
        }
        throw new BookNotFoundException("Книга не найдена");
    }

    public String toString() {
        String temp = "";
        try {
            for (Book book : bookList.getBookList()) {
                temp += book.toString() + "\n";
            }
        } catch (BookListEmpthy bookListEmpthy) {
            bookListEmpthy.printStackTrace();
        }
        return temp;
    }
}
