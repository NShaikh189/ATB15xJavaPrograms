import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.List.*;

public class HelloWorld {

    public static void msg(String msg)
    {
        System.out.println(msg);

    }
    public static void main(String[] args)
    {
        msg("Hello World");
        int[] a ={1,3,4,5,6};
        List<Integer> x = Arrays.stream(a).boxed().collect(Collectors.toList());

        List<Integer> i = Arrays.asList(1,2,3,4,5);
        System.out.println(i);
        }
}

