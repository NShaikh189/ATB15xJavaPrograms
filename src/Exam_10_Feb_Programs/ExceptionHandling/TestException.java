package Exam_10_Feb_Programs.ExceptionHandling;

import Exam_10_Feb_Programs.OuterAndInner.Outer;

public class TestException {

    public static void main(String[] args) {
        float result = 0;
        try {
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);

            result = n1/n2;
            System.out.println("Result: "+result);
        }catch (ArithmeticException ae){
            System.out.println("Arithmetic Exception: "+ae.getMessage());
        }
        catch (NumberFormatException ne){
            System.out.println("Number Format Exception: "+ne.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException aiob){
            System.out.println("Array Index Out of Bounds: "+aiob.getMessage());
        }
    }
}
