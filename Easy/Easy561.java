package LeetCode;

import java.util.Arrays;

class Solution561 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0, i = 0;
        while (i < nums.length - 1) {
            sum += Math.min(nums[i++], nums[i++]);
        }
        return sum;
    }
}

public class Easy561 {
    public static void main(String[] args) {
        int[] nums = {6, 2, 6, 5, 1, 2};
        Solution561 obj = new Solution561();
        System.out.println(obj.arrayPairSum(nums));
    }
}
