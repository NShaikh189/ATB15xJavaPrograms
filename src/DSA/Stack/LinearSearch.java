package DSA.Stack;

public class LinearSearch {

    private static int linearSearch(int[] arr, int num)
    {

        for(int i=0;i<arr.length;i++)
        if(arr[i]==num)
            return i;

            return -1;
    }
    public static void main(String[] args) {
        int arr[] = {23,22,53,12,5,2,6,1,28}; //9
        int index = linearSearch(arr,6);
        if(index!=-1)
            System.out.println("Number found at index: "+index);
        else
            System.out.println("Number not present in the array");
    }
}
