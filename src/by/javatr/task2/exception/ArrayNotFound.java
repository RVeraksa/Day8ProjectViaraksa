package by.javatr.task2.exception;

public class ArrayNotFound extends Exception {
    public ArrayNotFound(String message){
        super(message);
    }

    public ArrayNotFound(String message, Exception ex){
        super(message, ex);
    }
}
