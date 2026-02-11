package Exam_10_Feb_Programs.ExceptionHandling;

public class InvalidAgeException extends RuntimeException{

    public InvalidAgeException(String msg)
    {
        System.out.println(msg);
    }
}
