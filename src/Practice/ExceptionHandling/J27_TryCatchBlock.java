package Practice.ExceptionHandling;

public class J27_TryCatchBlock {
    public static void main() {

        try{
            int i=9/0;
            System.out.println("Selenium");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
