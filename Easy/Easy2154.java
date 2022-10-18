package LeetCode;

import java.util.HashSet;

class Solution2154 {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> has= new HashSet<>(nums.length);
        for (int i=0;i<=nums.length-1;i++)
            has.add(nums[i]);
        for (int i=0;i<=nums.length-1;i++) {
            if (!has.contains(original))
                break;
            original = original * 2;
        }
        return original;
    }
}

public class Easy2154 {
    public static void main(String[] args) {
        int[] nums = {4, 2};
        int original = 2;
        Solution2154 obj = new Solution2154();
        System.out.println(obj.findFinalValue(nums, original));
    }
}
