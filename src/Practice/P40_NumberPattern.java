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
    }
}
