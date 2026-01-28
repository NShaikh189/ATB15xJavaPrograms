package Practice;

import java.util.*;

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

    public static int[] twoSum1(int[] nums, int target) {

        Map<Integer,Integer> hashMap = new HashMap<>();

        for(int i=0;i<=nums.length-1;i++)
        {
            int temp = target - nums[i];

            if(hashMap.containsKey(temp))
            {
             return new int[]{hashMap.get(temp),i};
            }

            hashMap.put(nums[i],i);
        }

        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,7,11,15};

        int target = 9;

        twoSum(arr,target);


        int arr1[] = twoSum1(arr,target);
        System.out.println(Arrays.toString(arr1));
    }
}
