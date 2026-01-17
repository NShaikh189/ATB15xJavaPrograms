package Practice;

import java.util.Scanner;

import static Practice.J_16_Final.i;

public class P44_ReverseStringNoInBuilt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        char[] ch = str.toCharArray();

        StringBuffer sb = new StringBuffer();
        if(str.length()>1)
        {
            for(int i= ch.length-1; i>=0; i--)
                sb.append(ch[i]);
        }

        System.out.println("Reverse String : "+sb.toString());


    }
}
