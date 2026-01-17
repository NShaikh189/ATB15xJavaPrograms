package Practice;

import java.util.Scanner;

public class P43_ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
       // String temp="";

        char[] ch = str.toCharArray();

        if(str.length()>1)
        {
            str = "";
            for(int i= ch.length-1; i>=0; i--)
                str += ch[i];
        }

        System.out.println("Reverse String : "+str);


    }
}
