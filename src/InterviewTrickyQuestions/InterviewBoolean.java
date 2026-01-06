package InterviewTrickyQuestions;

public class InterviewBoolean {
    public static void main() {
        Boolean flag=null;

        if(flag)
            System.out.println("True");
        else
            System.out.println("False");
        /*
        O/P: NullPointerException
        Boolean is non primitive data hence can have null value
        but throws runtime exception during execution
         */

        //boolean f = null; //primitive datatype and boolean can store only true or false values
    }
}
