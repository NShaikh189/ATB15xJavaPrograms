package Practice;

import java.util.Arrays;

/*
Swap all 1's to the end of the array
 */
public class P10_Array_SwapNumbers {
    public static void main() {
        int arr[] = {2,3,1,0,4,1,5,6};

        int pos=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=1)
            {
                arr[pos]=arr[i];
                pos++;
            }
        }

        while(pos<arr.length)
        {
            arr[pos]=1;
            pos++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
