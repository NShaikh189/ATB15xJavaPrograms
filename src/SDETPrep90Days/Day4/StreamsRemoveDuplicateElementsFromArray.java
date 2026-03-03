package SDETPrep90Days.Day4;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class StreamsRemoveDuplicateElementsFromArray {

    public static void main() {

        int a[] = {20,10,10,30,10,40};


        int uniqueArr[] = Arrays.stream(a).distinct().toArray();
        for(int x: uniqueArr)
            System.out.println(x);
    }
}
