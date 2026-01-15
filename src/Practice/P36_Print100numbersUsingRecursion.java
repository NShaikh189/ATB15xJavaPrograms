package Practice;
//1,2,3,4......100
public class P36_Print100numbersUsingRecursion {

    static void printNumbers1to100(int n)
    {
        if(n>100)
            return;

        System.out.println(n);
        printNumbers1to100(n+1);

    }

    static void printNumbers100to1(int n)
    {
        if(n<1)
            return;
        System.out.println(n);
        printNumbers100to1(n-1);
    }
    public static void main(String[] args) {

       printNumbers1to100(1);
        System.out.println("=".repeat(10));
       printNumbers100to1(100);
    }
}
