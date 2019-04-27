package by.javatr.task1.exception;

public class BookNotFoundException extends Exception {
    public BookNotFoundException(String message){
        super(message);
    }

    public BookNotFoundException(String message, Exception ex){
        super(message, ex);
    }
}
