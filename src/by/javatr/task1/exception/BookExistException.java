package by.javatr.task1.exception;

public class BookExistException extends Exception {
    public BookExistException(String message){
        super(message);
    }

    public BookExistException(String message, Exception ex){
        super(message, ex);
    }
}
