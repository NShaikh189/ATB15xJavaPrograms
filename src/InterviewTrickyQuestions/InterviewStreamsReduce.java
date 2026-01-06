package InterviewTrickyQuestions;

import java.util.Arrays;
import java.util.List;

public class InterviewStreamsReduce {
    public static void main() {
        List<String> names = Arrays.asList("ABC","CAB","BCA");

        String result = names.stream()
                .reduce("",(a,b)->a+b.charAt(1));

        System.out.println(result); //BAC
    }
}
