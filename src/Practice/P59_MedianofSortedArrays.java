package Practice;

import java.util.Arrays;

public class P59_MedianofSortedArrays {

    static void merge(int[] arr1, int[] arr2)
    {
        int m = arr1.length;
        int n = arr2.length;
        int[] sortedArr = new int[m+n];
        int i=0;
        int j=0;
        int k=0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        while(i<m && j<n)
        {
            if(arr1[i]<=arr2[j]) {
                sortedArr[k] = arr1[i];
                i++;
                k++;
            }
            else {
                sortedArr[k] = arr2[j];
                j++;
                k++;
            }
        }

        while(j<n)
        {
            sortedArr[k]=arr2[j];
            j++;
            k++;
        }

        while(i<m)
        {
            sortedArr[k]=arr1[i];
            i++;
            k++;
        }


        System.out.println(Arrays.toString(sortedArr));

        int len = sortedArr.length;

        if (len % 2 != 0)
            System.out.println( sortedArr[len / 2]);
        else
            System.out.println( (sortedArr[len / 2 - 1] + sortedArr[len / 2]) / 2.0);

    }
    public static void main(String[] args) {
        int[] arr1={1,3};
        int[] arr2 = {4,2};

        merge(arr1, arr2);

    }
}
