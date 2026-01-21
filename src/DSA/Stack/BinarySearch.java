package DSA.Stack;

import java.util.Arrays;

public class BinarySearch {

    private static int binarySearch(int[] arr, int target)
    {
        //divide
        int middle = arr.length/2;
        int index=-1;
        int left = 0;
        int right=arr.length-1;
        Arrays.sort(arr);
        System.out.println("Sorted Array: "+Arrays.toString(arr));
        while(left<=right) {

            middle = (left+right)/2;
            if(target == arr[middle])
            {
                index = middle;
                break;
            }
            else if (target < arr[middle]) {
                right = middle-1;

            }
            else if(target>arr[middle])
            {
                left = middle+1;

            }
        }

        return index;

    }
    public static void main(String[] args) {
        int arr[] = {23,22,53,12,5,2,6,1,28}; //9
        int index = binarySearch(arr,58);
        if(index!=-1)
            System.out.println("Number found at index: "+index);
        else
            System.out.println("Number not present in the array");
    }
}
