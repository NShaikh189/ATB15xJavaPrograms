package Practice;

import java.util.Arrays;

import static Practice.P50_TwoSumHashSet.twoSum;

public class P71_TwoSumArray {

    void main() {
        int[] nums = {0,1,2, 3, 5, 6,7, 8, 9, 10, 11};
        int target = 8;

       // twoSum(nums, target);
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left]+nums[right];

            if (sum == target) {
                System.out.println(nums[left] + "," + nums[right]);
                //break;
                left++;
                right--;
                continue;
            }

            if(sum>target)
            {
                right--;
            }
            else if(sum<target)
            {
                left++;
            }
            }

    }
}
