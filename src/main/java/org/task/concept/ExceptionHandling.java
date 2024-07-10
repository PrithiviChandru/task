package src.main.java.org.task.concept;

public class ExceptionHandling {

    public static void main(String[] args) {
        try {
            throw new CustomException("CUSTOM EXCEPTION");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }

    }

}

class CustomException extends Exception {

    public CustomException(String msg) {
        super(msg);
    }

}