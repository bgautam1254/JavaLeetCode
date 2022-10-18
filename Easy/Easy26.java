package LeetCode;
import java.io.FilterOutputStream;
import java.util.Arrays;

class Solution26 {
    public int removeDuplicates(int[] nums) {
//        if (nums.length == 0)
//            return 0;
//
//        int i = 0, j = 0, k = nums[nums.length - 1] + 1;
//
//        while (i < nums.length - 1) {
//            if (nums[i] == nums[i + 1]) {
//                nums[i] = k;
//                k++;
//                j++;
//            }
//            i++;
//        }
//        Arrays.sort(nums);
//        return nums.length - (j);

        System.out.println(nums.length);
        int i = 1;
        for (int n : nums)
            if ( n > nums[i-1])
                nums[i++] = n;
        System.out.println(Arrays.toString(nums));
        return nums.length-i;
    }
}

public class Easy26 {
    public static void main(String[] args) {
        int[] nums = {-10,-10,-9,-9,0,1,1,2,3,4,6,8,8,8,10,11,15};
        Solution26 obj = new Solution26();
        System.out.println(obj.removeDuplicates(nums));
    }
}
