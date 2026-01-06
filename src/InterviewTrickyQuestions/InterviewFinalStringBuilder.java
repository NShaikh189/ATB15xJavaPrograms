package InterviewTrickyQuestions;

public class InterviewFinalStringBuilder {
    public static void main() {
        final StringBuilder sb = new StringBuilder("A");
        sb.append("B");
        System.out.println(sb); //AB  => StringBuilder is mutable. final allows the internal change but not new value
       // sb = new StringBuilder("C"); cannot assign the value to the variable sb

        final String s = "Hello";
        s.concat("world");
        System.out.println(s); //Hello => String is immutable. No changes allowed

    }
}
