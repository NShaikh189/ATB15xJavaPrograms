package Practice;

public class P07_SumOfNaturalNumbers {

    static int sum(int n)
    {
        return n*(n+1)/2;
    }
    public static void main() {
        //Sum of 'n' natural numbers formula: sum = n(n+1)/2;

        int n=15;
        int sum = sum(n);
        System.out.println(sum);
    }
}
