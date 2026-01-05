package ex_03_Literals;

public class Lab008_Literals_P1 {
    public static void main(String[] args) {
        int a = 10;
        //datatype variable operator literal
        char rupee = '\u20B9';
        System.out.println(rupee);
        char rs = '₹';
        char v=65;
        System.out.println(rs);
        System.out.println(v);
        Boolean flag=null;
        //boolean flag1 = null; Compile Time java: incompatible types: <nulltype> cannot be converted to boolean
        if(flag) //Runtime Exception: NullPointerException
        System.out.println("True");
        else
            System.out.println("False");
    }
}
