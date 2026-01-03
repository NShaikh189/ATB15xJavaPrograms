package Practice.StringManipulation;
/*
Convert first character of every word to uppercase
 */
public class P16_StringUpperCase {
    public static void main() {
        String str = "india is my country.";

       // str.chars().

       String[] strArray = str.split(" ");
       String newStr="";
       for(String s: strArray)
       {

           String temp = s.substring(0,1).toUpperCase().concat(s.substring(1));
           newStr = newStr.concat(temp)+" ";

       }
        System.out.println(newStr.trim());
    }
}
