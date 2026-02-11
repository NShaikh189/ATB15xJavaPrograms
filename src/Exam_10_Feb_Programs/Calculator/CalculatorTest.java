package Exam_10_Feb_Programs.Calculator;

public class CalculatorTest {

    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("Integer addition: "+c.add(5,3));
        System.out.println("Double addition: "+c.add(2.5, 3.7));
        System.out.println("Three integers addition: "+c.add(1, 2, 3));

   //     System.out.println("Five integers addition: "+c.add(2,3,4,5,6));

    }
}
