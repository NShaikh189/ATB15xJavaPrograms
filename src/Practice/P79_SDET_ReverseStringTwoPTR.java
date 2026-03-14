package Practice;

public class P79_SDET_ReverseStringTwoPTR {
    public static void main() {
        String str = "Hello W@rld!";
        char ch[] =  str.toCharArray();
        for(int i=0; i<=ch.length-1;i++)
        {
            int index = ch.length-1-i;
            if(Character.isLetter(ch[index])||ch[index]==' ')
            System.out.print(ch[index]);
        }
    }
}
