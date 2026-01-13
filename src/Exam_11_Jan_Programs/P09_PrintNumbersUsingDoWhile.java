package Exam_11_Jan_Programs;

/*
Write a Java program to print numbers from 1 to 10 using a do-while loop.


 */
public class P09_PrintNumbersUsingDoWhile {
    public static void main(String[] args) {
    int n=0;
        do{
            System.out.println(++n);
        }while(n!=10);
    }
}
