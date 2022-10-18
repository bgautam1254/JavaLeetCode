package LeetCode;

class Solution485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int k = 0, l = 0;
        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] == 1) {
                k++;
                if (i == nums.length - 1 && k > l)
                    return k;
            }
            else if (k > l) {
                l = k;
                k = 0;
            }
            else k = 0;
        }
        return l;
    }
}

public class Easy485 {
    public static void main(String[] args) {
        int[] a = {1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1};
        Solution485 obj = new Solution485();
        System.out.println(obj.findMaxConsecutiveOnes(a));
    }
}