package Practice.ExceptionHandling;

public class J27_TryCatchFinallyNestedCalling {
    public static void main() {
        int marks = getMarks("Rahul");

        System.out.println(marks);
    }

    public static int getMarks(String name)
    {
        System.out.println("Getting marks for Rahul");
        if (name.equalsIgnoreCase("Rahul")) {

            try {
                int i = 9 / 0; //OR 9/3
                return 80;
            } catch (ArithmeticException e) {
                System.out.println("Catch Block");
                return 70;
            } finally {
                System.out.println("Finally block");
                try{
                    int i=9/0;
                    return 50;
                } catch (Exception e) {
                    System.out.println("Finally catch block");
                    return 40;
                }finally {
                    System.out.println("Finally finally block");
                    return 30;
                }

              //  return 60;
            }
        }else
            {
                System.out.println("Enter correct name");
                return -1;
            }

    }
}
