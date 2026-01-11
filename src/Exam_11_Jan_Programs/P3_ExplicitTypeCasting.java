package Exam_11_Jan_Programs;

/*
Description:
Write a Java program to convert a double value into an int using explicit type casting and print both values.
 */
public class P3_ExplicitTypeCasting {
    public static void main(String[] args) {
        double val = 245.663;
        int num = (int) val;

        System.out.println("Double Value: "+val);
        System.out.println("Integer Value: "+num);
    }
}
