package DSA.Stack;

import java.util.Arrays;

public class BinarySearchRescursion {

    private static int binarySearchRecursion(int arr[], int target, int left, int right)
    {
        int middle = (left+right)/2;
       // int index=-1;
        if(right<left)
            return -1;

        if(target==arr[middle])
        {
            return middle;
        }

            if(target<arr[middle])
            {
                right=middle-1;
                return binarySearchRecursion(arr, target, left, right);
            }
            else
            {
                left = middle+1;
                return   binarySearchRecursion(arr, target, left, right);
            }



    }

    public static void main(String[] args) {
        int arr[] = {23,22,53,12,5,2,6,1,28}; //9
        Arrays.sort(arr);
        int index = binarySearchRecursion(arr,28,0, arr.length-1);
        if(index!=-1)
            System.out.println("Number found at index: "+index);
        else
            System.out.println("Number not present in the array");
    }
}
