package by.javatr.task1.exception;

public class BookListEmpthy extends Exception {
    public BookListEmpthy(String message){
        super(message);
    }

    public BookListEmpthy(String message, Exception ex){
        super(message, ex);
    }
}
