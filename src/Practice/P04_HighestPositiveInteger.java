package Practice;

import java.util.HashSet;
import java.util.Set;

public class P04_HighestPositiveInteger {

    public static int findMax(int nums[])
    {
        Set<Integer> numSet = new HashSet<>();
        for(int n: nums)
            numSet.add(n);
        int maxNumber = -1;

        for(int n: nums)
        {
            int num = Math.abs(n);
            if(n<0 && numSet.contains(num))
            maxNumber = Math.max(maxNumber,num);
        }

        return maxNumber;
    }
    public static void main(String[] args) {
        int nums[] = {-6,2,-3,4,-2,6,3};
        int max = findMax(nums);
        System.out.println("Highest Positive Number: "+max);
    }
}
