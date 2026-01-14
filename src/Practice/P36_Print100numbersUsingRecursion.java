package Practice;
//1,2,3,4......100
public class P36_Print100numbersUsingRecursion {

    static void printNumbers(int n)
    {
        if(n>100)
            return;

        System.out.println(n);
        printNumbers(n+1);

    }
    public static void main(String[] args) {

       printNumbers(1);
    }
}
