package Practice;


public class LC125_ValidPalindromeTwoPtr {

    public static void main() {
        String str = "race@ e :car";

        StringBuilder sb = new StringBuilder();

        char[] ca = str.toCharArray();

        for(char c: ca)
            if(Character.isLetterOrDigit(c))
                sb.append(Character.toLowerCase(c));

        String mstr = sb.toString();
        System.out.println("New String: "+mstr);
        String rstr = sb.reverse().toString();

        if(mstr.equalsIgnoreCase(rstr))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");

        checkPalindrome(mstr);
    }

    public static void checkPalindrome(String mstr)
    {
        System.out.println("==============");
        int left = 0;
        int right = mstr.length()-1;
        char[] ch = mstr.toCharArray();
        boolean flag = false;

        while(left<right)
        {
            if(ch[left]!=ch[right])
            {
            flag = false;
            break;
            }
            flag = true;
            left++;
            right--;
        }

        if(flag)
            System.out.println("Paliondrome");
        else System.out.println("Not a Palindrome");
    }
}
