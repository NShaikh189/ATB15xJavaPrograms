package Practice.ExceptionHandling;

public class J27_TryCatchFinallyCalling {
    public static void main() {
        int marks = getMarks("Rahul");

        System.out.println(marks);
    }

    public static int getMarks(String name)
    {
        if (name.equalsIgnoreCase("Rahul")) {

            try {
                int i = 9 / 3;
                return 80;
            } catch (ArithmeticException e) {
                System.out.println("Catch Block");
                return 70;
            } finally {
                System.out.println("Finally block");
                return 60;
            }
        }else
            {
                System.out.println("Enter correct name");
                return -1;
            }

    }
}
