package Practice.ExceptionHandling;
/*
 - No try without catch or finally
 */
public class J27_TryBlock {
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
