package InterviewTrickyQuestions;

public class InterviewifStatement {
    public static void main() {
        int x=10;
        if(x!=10); //If statement end here so it will execute below statements irrespective of the condition
        {
            System.out.println("Hello");
        }
        System.out.println("World");


        for(int i=0;i<10;i++);
        {
            System.out.println("Hello");
        }
        System.out.println("World");
    }
}
