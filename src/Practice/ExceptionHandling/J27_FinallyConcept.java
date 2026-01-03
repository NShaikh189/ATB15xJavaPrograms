package Practice.ExceptionHandling;
/*
- If no catch block and finally block exists then the finally block will be executed before throwing the exception
- No finaly with out try or try-catch block
 */
public class J27_FinallyConcept {
    public static void main() {
        try {
            int n = 9 / 0;
            System.out.println("hello!");
        }
       finally{
            System.out.println("Finally Blocked");
        }
    }
}
