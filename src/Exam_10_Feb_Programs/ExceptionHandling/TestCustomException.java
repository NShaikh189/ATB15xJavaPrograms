package Exam_10_Feb_Programs.ExceptionHandling;

import java.util.Scanner;

public class TestCustomException {
    public void validateAge(int age)
    {
        if(age<18)
        {
            throw new InvalidAgeException("InvalidAgeException: Age must be 18 or above. Provided age: "+age+" Age is valid: 25");
        }
        else
            System.out.println("Age is valid");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Age");
        int age = scanner.nextInt();


        TestCustomException te = new TestCustomException();
        te.validateAge(age);
        scanner.close();
    }
}
