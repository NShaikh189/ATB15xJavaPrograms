package Exam_11_Jan_Programs;
/*
Write a Java program to print all even numbers between 1 and 50 using a do-while loop.
 */
public class P10_PrintEvenNumbers {
    public static void main(String[] args) {

        int n=1;
        do
        {
            if(n%2==0)
                System.out.println(n);
            n++;
        }while(n<50);
    }
}
