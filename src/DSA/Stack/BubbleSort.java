package DSA.Stack;

import java.util.Arrays;
//after every for loop large number will move to last
// and skip the number of elements compared and moved to the last
// i.e the number of times first loop is run 'i'
//hence => arr.length-i
//if i=2 means two large values are already sorted and need no more comparison

public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = {23,22,53,12,5,2,6,1,28}; //9

        //23,22,53,12,5,2,6,1,28
        for(int i=0; i<arr.length;i++)
        {
              for(int j=1;j<arr.length-i;j++)
            {
                //swap
                if(arr[j-1]>arr[j])
                {
                   int temp = arr[j-1];
                   arr[j-1]=arr[j];
                   arr[j]=temp;
                }

            }
        }

        System.out.println("Sorted Array: "+ Arrays.toString(arr));
    }
}
