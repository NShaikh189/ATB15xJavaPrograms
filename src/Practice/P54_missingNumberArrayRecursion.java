package Practice;

public class P54_missingNumberArrayRecursion {

    static int sum(int arr[], int i)
    {
        if(i==0)
            return arr[0];


        return arr[i]+sum(arr,i-1);
    }

    static int naturalSum(int n)
    {
        return  (n*(n+1)/2);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,6,5,8};
        int sum = 0;
        sum = sum(arr,arr.length-1);
        System.out.println(sum);

        int nsum = naturalSum(arr.length+1);
        System.out.println(nsum);
        System.out.println("Missing number: "+(nsum-sum));
    }
}
