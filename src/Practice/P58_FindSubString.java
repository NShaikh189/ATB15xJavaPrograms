package Practice;

public class P58_FindSubString {
    public static void main(String[] args) {
        String str = "HikingIsKingdom";
        String subs = "King";

        checkContains(str,subs);
    }

    static void checkContains(String str, String subs)
    {
        if(subs.length()>str.length())
        {
            System.out.println("Does not contains");
            return;
        }

        for(int i =0; i<str.length()-subs.length();i++)
         {
             int j=0;
             while(j<subs.length() && str.charAt(i+j)==subs.charAt(j))
             {
                 j++;
             }

             if(j==subs.length())
             {
                 System.out.println("contains");
                 return;
             }
         }

             System.out.println("Not contains");

    }
}
