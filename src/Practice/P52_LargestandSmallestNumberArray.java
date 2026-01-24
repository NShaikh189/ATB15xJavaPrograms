package Practice;


import java.util.Arrays;

public class P52_LargestandSmallestNumberArray {

    public static void main(String[] args) {

        int arr[] = {2,4,5,21,77,3,32};

        Arrays.sort(arr);
        System.out.println("Min element: "+arr[0]);

        System.out.println("Max element:"+arr[arr.length-1]);
    }


}
