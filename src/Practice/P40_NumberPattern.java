package Practice;
//1,12,123,124,,,,
public class P40_NumberPattern {
    public static void main(String[] args) {

        for(int i=1; i<=5; i++)
        {
            for(int n=1; n<=i; n++)
                System.out.print(n);
            System.out.print(",");

        }

        System.out.println("----------------");
        numberPattern(10);
    }

    //1,12,123
    static void numberPattern(int n)
    {
        if(n==1)
            return;

        numberPattern(n-1);

        for(int i=1;i<n;i++)
        System.out.print(i);
        System.out.print(",");

        }
}
