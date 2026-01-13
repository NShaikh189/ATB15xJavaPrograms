package Exam_11_Jan_Programs;
/*
Write a Java program to print numbers from 1 to 10,
but skip printing the number 5 using the continue statement.
 */
public class P13_ContinueStatementExample {
    public static void main(String[] args) {

        for(int num=1; num<=10; num++)
        {
            if(num==5)
                continue;
            System.out.println(num);
        }
    }
}
