package Practice.ExceptionHandling;

public class J27_TryCatchFinallyBlock {
    public static void main() {

        try{
            int i=9/0;
            System.out.println("Selenium");
        }
        catch (Exception e)
        {
            System.out.println("Catch block "+e.getMessage());

        }
        finally {
            System.out.println("Finally block");
        }
    }
}
