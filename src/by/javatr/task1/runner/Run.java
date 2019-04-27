package by.javatr.task1.runner;

import by.javatr.task1.exception.BookExistException;
import by.javatr.task1.exception.BookInitializationException;
import by.javatr.task1.exception.BookListEmpthy;
import by.javatr.task1.exception.BookNotFoundException;
import by.javatr.task1.library.BookList;
import by.javatr.task1.util.Book;
import by.javatr.task1.util.BookField;
import by.javatr.task1.util.BookListDao;

public class Run {
    public static void main(String[] args) {
        BookListDao listDao = new BookListDao(BookList::new);
            try {
                Book book1 = new Book();
                book1.setAuthor("Ремарк");
                book1.setTitle("Триумфальная арка");
                book1.setPages(412);
                book1.setPrice(8.5);
                Book book2 = new Book("Бесы","Достоевский",12.1,801);
                Book book3 = new Book("Журавлиный крик","Быков");
                book3.setPrice(12.1);
                book3.setPages(145);
                listDao.addBook(book1);
                listDao.addBook(book2);
                listDao.addBook(book3);
                System.out.println(listDao);
                listDao.sort(BookField.AUTHOR);
                System.out.println(listDao);
                listDao.removeBook(book1);
                System.out.println(listDao.findBook(BookField.PRICE,12.1));
                System.out.println(listDao.findBook(BookField.TITLE,"бесы"));
                Book book4 = new Book("На ростанях","Колас",7.1,214);
                listDao.removeBook(book4);
            } catch (BookInitializationException e) {
                e.printStackTrace();
                System.out.println("Проверьте параметры книги!");
            } catch (BookExistException e) {
                e.printStackTrace();
                System.out.println("Книга которую вы ложите на полку уже есть там ");
            } catch (BookListEmpthy bookListEmpthy) {
                bookListEmpthy.printStackTrace();
                System.out.println("Нечего сортировать, на полке нет книг!");
            } catch (BookNotFoundException e) {
                e.printStackTrace();
                System.out.println("Книга, которую вы пытетесь удалить - не существует");
            }  catch (Exception e){
                e.printStackTrace();
            }
    }
}
