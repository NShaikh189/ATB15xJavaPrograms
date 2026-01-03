package Practice.StringManipulation;

public class P18_StringUpperCaseEscapeCharacter {
    public static void main() {
        String str = "pallavi||sharma||india||30";

        // str.chars().

        String[] strArray = str.split("\\|\\|");
        String newStr="";
        for(String s: strArray)
        {

            String temp = s.substring(0,1).toUpperCase().concat(s.substring(1));
            newStr = newStr.concat(temp)+" ";

        }
        System.out.println(newStr.trim());

    }
}
