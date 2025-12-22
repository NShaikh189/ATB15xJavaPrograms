package Practice;

import static java.util.Collections.reverse;
import static java.util.Collections.rotate;

/*
Rotate array to the right by k elements
Logic:
Rotate the whole array
rotate the elements in the array for the first k elements
rotate the remaining elements in the array
 */
public class P05_RotateArray {

    public static void main() {
        int arr[] = {4,2,3,5,6,7};
        int k = 4;
        int n = arr.length;
       // int start = n-k;
        // int end = n-1

        System.out.println("-----Reverse whole array-----");

        reverse(arr,0, n-1);
        for(int x: arr)
            System.out.print(x);

        System.out.println("\n-----Reverse First K elements in the array-----");
        reverse(arr, 0, k-1);
        for(int x: arr)
            System.out.print(x);

        System.out.println("\n-----Reverse remaining elements in the array-----");
        reverse(arr,k,n-1);

        for(int x: arr)
        System.out.print(x);
    }

    private static void reverse(int[] arr, int start, int end) {
        while(start < end){
           int temp = arr[start];
           arr[start] = arr[end];
           arr[end]=temp;
           start++;
           end--;
        }
    }
}
