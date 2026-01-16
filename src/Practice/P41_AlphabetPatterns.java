package Practice;

public class P41_AlphabetPatterns {
    public static void main(String[] args) {

        int n=6;
        for(int i=1; i<=n; i++)
        {
            for(char ch='A'; ch<='A'+i; ch++)
                System.out.print(ch);
            System.out.print(",");

        }
    }
}
