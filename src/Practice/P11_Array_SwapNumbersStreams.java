package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class P11_Array_SwapNumbersStreams {

    public static void main() {
        int arr[] = {2,3,1,4,2,1,5,7};

       List<Integer> arrList =  new ArrayList<>();
       arrList = Arrays.stream(arr).filter(val -> (val!=1) ).boxed().collect(Collectors.toList());

        System.out.println(arrList);

        while(arrList.size()<arr.length)
            arrList.add(1);

        System.out.println(arrList);

    }
}
