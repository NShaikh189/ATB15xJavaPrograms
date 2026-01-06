package InterviewTrickyQuestions;

public class UnaryOperator {
    public static void main() {
        int a=5;
        int b = ~a;//~x = -(x+1) => -(5+1)
        System.out.println(b); //-6

        int c = -9;
        int d = ~c; //~x= -(x+1) => -(-9+1) = 8
        System.out.println(d); //8
    }
}
