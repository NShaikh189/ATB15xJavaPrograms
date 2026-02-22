package Practice;

public class P70_StringLenCountWOLengthMtd {
    public static void main(String[] args) {


        String str = "Hello World!";

        //streams
        long chCount = str.chars().count();
        System.out.println(chCount);

        //toCharArray
        int cnt=0;
        char ch[] = str.toCharArray();

        for(char c: ch)
        {
            cnt++;
        }

        System.out.println(cnt);

    }
}
