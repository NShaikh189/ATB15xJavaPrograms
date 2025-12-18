package ex_02_Java_Basics;


public class Lab006_DataTypes
{
     static void main(String[] args) {
        byte b =127; // -128 to 127 = 2^7
        short sh = 32767; // -32768 to 32767 = 2^15
        int in = 343432239; //-2,147,483,648 to 2,147,483,647
        long l = 9762341888L; //2^63
        float f = 3.14566f; //upto 7 decimal digits
        boolean flag = true;
        char ch = 250;
        System.out.println(Character.valueOf(ch));
        System.out.printf("%c",ch);
        System.out.println(sh);
        System.out.println(b);
        System.out.println(in);
        System.out.println(l);
        System.out.println(f);
        System.out.println(flag);
    }
}
