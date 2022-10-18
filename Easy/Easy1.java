package LeetCode;

import java.util.Arrays;

class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++)
            for (int j = 0; j <= nums.length - 1; j++)
                if (nums[i] + nums[j] == target && i != j) {
                    nums = new int[]{i, j};
                    break;
                }
        return nums;
    }
}

public class Easy1 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;
        Solution1 obj = new Solution1();
        System.out.println(Arrays.toString(obj.twoSum(nums, target)));
    }
}
