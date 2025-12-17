package Practice;

import java.util.ArrayList;
import java.util.List;

public class P03_Array_SwapNumbers {

    public static void main(String[] args) {
        int arr[]={1,0,3,0,5}; //o/p: [1, 3, 5, 0, 0]
        List<Integer> arrList = new ArrayList<>();

        for(int i=0; i<=arr.length-1; i++)
        {
            if(arr[i]!=0)
            {
                arrList.add(arr[i]);
            }
        }
        /*
            arrList.add(arr[i]; //add all ints in the list
            arrList.removeIf(n-> n==0);
                    while(arrList.size()<arr.length)
                    arrList.add(0);
         */
        while (arrList.size()<=arr.length-1)
        {
             arrList.add(0);
        }
        System.out.println(arrList);
    }
}
