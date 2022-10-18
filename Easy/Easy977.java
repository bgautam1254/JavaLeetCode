package LeetCode;
import java.util.Arrays;

class Solution977 {
    public int[] sortedSquares(int[] nums) {

        //  1st Solution
        int i=0;
        while (i<=nums.length-1){
            nums[i] *=nums[i];
            i++;
        }
        Arrays.sort(nums);
        return nums;

//        //  2nd Solution
//        Arrays.setAll(nums, i-> nums[i]*nums[i]);
//        Arrays.sort(nums);
//        return nums;
    }
}

public class Easy977 {
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        Solution977 obj = new Solution977();
        System.out.println(Arrays.toString(obj.sortedSquares(nums)));
    }
}
