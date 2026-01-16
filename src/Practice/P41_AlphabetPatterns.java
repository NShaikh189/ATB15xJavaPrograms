package Practice;

public class P41_AlphabetPatterns {
    public static void main(String[] args) {

        for(char i='A'; i<='E'; i++)
        {
            for(char n='A'; n<=i; n++)
                System.out.print(n);
            System.out.print(",");

        }
    }
}
