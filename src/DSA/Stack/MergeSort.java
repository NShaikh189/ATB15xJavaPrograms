package DSA.Stack;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class MergeSort {

    private static void sort(int[] arr)
    {
        //Break
        if(arr.length<2)
            return;
        int middle = arr.length/2;
        int left[] = new int[middle];
        int right[] = new int[arr.length-middle];

        for(int i=0; i<middle;i++)
        {
            left[i]=arr[i];
        }

        for(int i=middle; i<arr.length;i++)
        {
            right[i-middle] = arr[i];
        }
        //1. L {4,1} => R = {2,7,9}
        sort(left); //sort(4,1) => sort(4), sort(1)
        sort(right); //

        //merge
        merge(left, right, arr);
    }

    private static void merge(int[] left, int[] right, int[] arr)
    {
        int i=0, j=0,k=0;

        while(i<left.length && j<right.length)
        {
            if(left[i]<=right[j])
            {
                arr[k]=left[i];
                k++;
                i++;

            }
            else
            {
                arr[k] = right[j];
                k++;
                j++;
            }


        }

        while(j<right.length)
            arr[k++]= right[j++];


        while (i<left.length)
            arr[k++] = left[i++];
    }
    public static void main(String[] args) {
        int arr[] = {4,1,2,7,9}; //9


        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
