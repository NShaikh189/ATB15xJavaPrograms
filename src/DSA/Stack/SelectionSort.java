package DSA.Stack;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int arr[] = {23,22,53,12,5,2,6,1,28}; //9
        int count=0;
        int minIndex;
        for(int i=0; i<arr.length;i++)
        {
             minIndex = i;
            for(int j = i; j<arr.length;j++)
            {
                if(arr[j]<arr[minIndex])
                {
                    int temp = arr[j];
                    arr[j] = arr[minIndex];
                    arr[minIndex] = temp;
                }
                count++;

            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("No. of steps: "+count);
    }
}
