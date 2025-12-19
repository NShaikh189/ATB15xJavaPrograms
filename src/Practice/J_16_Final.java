package Practice;
/*
constants: Special variable whose **value can't be modified during the program execution.**
Constant is also called as **final** variable
final keyword is used for constant values
Once assigned cannot be changed
can be used for class variable and local variables
 */

public class J_16_Final {

    static final int i=10;
    int j=10;

    public static void checkFinal(int j)
    {
        System.out.println(j);
        j=50;
        System.out.println(j);
    }
    public static void main(String[] args) {
        final int j=20;
        System.out.println("Main:"+j);
        //j=100;
        checkFinal(j);
        System.out.println("Main:"+i);
//        i = 100;
//        System.out.println("Main:"+i);

    }
}
