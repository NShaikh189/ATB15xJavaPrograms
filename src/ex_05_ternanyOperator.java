public class ex_05_ternanyOperator {
    public static void main() {
        int marks = 100;
        String result = marks>=40 ? "Pass" : "Fail";
        System.out.println(result);
        int a = (int)'A' ;
        int b = Character.getNumericValue('9');
        System.out.println(a);
        System.out.println(b);
    }
}
