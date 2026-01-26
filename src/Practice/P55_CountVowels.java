package Practice;


public class P55_CountVowels {
static void countVowels(String str)
{
    int cnt;

    cnt= (int)str.chars().mapToObj(ch->(char)ch)
            .filter(ch->"aeiou".indexOf(Character.toLowerCase(ch))!=-1)
            //.filter(ch->String.valueOf(ch).matches("[aAeEiIoOuU]"))
            .count();
    System.out.println(cnt);


}
    public static void main(String[] args) {
String str = "India is my country. I am proud of it rich and varied heritage";
countVowels(str);
    }
}
