package ex_02_Java_Basics;

/*
* MultiLine comments
* Author: N. SHAIKH
* Learning: ATB15x
* */
//cmd+/ (To add comments)

//Class can have multiple main methods but only one will be executed having the signature
//public static void main(String args[])
public class Lab005_Comments_Multi {
    public static void main(String[] args)
        {
            //single line comment
            System.out.println("Hello");
            System.out.println(0.0/0); //NaN
            // System.out.println(10/0);//AE: / by zero
           // System.out.println(0/0);//AE: / by zero
            System.out.println(10.0/0);//Infinity
            System.out.println(10/0.0);//Infinity
    }

    public static void main() {

    }

    public static void main(int a) {

    }

}
