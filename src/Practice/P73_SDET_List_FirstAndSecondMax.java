package Practice;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//Sorting is very expensive technique so avoid sorting
//Optimal approach is Single loop

public class P73_SDET_List_FirstAndSecondMax {
    public static void main() {
        int arr[]= {1,34,2,3,20,15};

        int firstMax=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;

        for(int num : arr)
        {
            if(num>firstMax )
            {
                secondMax = firstMax;
                firstMax = num;

            }
            else if(num > secondMax)
            {
                secondMax = num;
            }
        }

        System.out.println("First Max: "+firstMax );
        System.out.println("Second Max: "+secondMax );
    }
}
