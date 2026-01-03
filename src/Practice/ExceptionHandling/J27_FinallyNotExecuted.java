package Practice.ExceptionHandling;

public class J27_FinallyNotExecuted {
    public static void main() {

        try{
            int i=9/0;
            System.out.println("Selenium");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.exit(1); //Shut down the JVM
        }
        finally {
            System.out.println("Finally block");
        }
    }
}
