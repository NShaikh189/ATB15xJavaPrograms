package Practice;

import java.util.HashSet;

public class P50_TwoSumHashSet {

    static void twoSum(int []arr, int target)
    {
        HashSet<Integer> hashSet=new HashSet<>();
        for(int num: arr) {
            int temp = target - num;
            if (hashSet.contains(temp))
                System.out.println("Pair found "+num+" , "+temp);

            hashSet.add(num);
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,3,2,1,5,6};

        int target = 5;

        twoSum(arr,target);
    }
}
