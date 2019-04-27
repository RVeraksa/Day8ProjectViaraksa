package by.javatr.task1.exception;

public class BookInitializationException extends Exception {
    public BookInitializationException(String message){
        super(message);
    }

    public BookInitializationException(String message, Exception ex){
        super(message, ex);
    }
}
