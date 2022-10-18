package LeetCode;

import java.util.Arrays;
import java.util.List;

class Solution189 {
    public void rotate(int[] nums, int k) {

        int[] array = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
            array[(i + k) % nums.length] = nums[i];
        System.arraycopy(array, 0, nums, 0, nums.length);
    }
}

public class Medium189 {
    public static void main(String[] args) {
        System.out.println(5%9);
        int[] nums = {-1, 6};
        int k = 3;
        Solution189 obj = new Solution189();
        obj.rotate(nums, k);
    }
}
