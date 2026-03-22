package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class P83_SDET_ListManipulation {

    public static void main() {
        List<Integer> numlist = new ArrayList<>(Arrays.asList(1,23,54,null,192,112,null,1102,111));


       List<Integer> nList = numlist.stream().filter(x-> Objects.nonNull(x)).filter(x->Integer.toString(x).startsWith("1")).toList();

       int num[]= numlist.stream().filter(x-> Objects.nonNull(x)).filter(x->Integer.toString(x).startsWith("1")).mapToInt(Integer::intValue).toArray();
        System.out.println(nList.toString());
        System.out.println(Arrays.toString(num));
    }
}
