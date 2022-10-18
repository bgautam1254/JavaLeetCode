package LeetCode;

import java.util.Arrays;

class Solution136 {
    public int singleNumber(int[] nums) {
//        Arrays.sort(nums);
//        for(int i=0;i<=nums.length-1;i++){
//            if(i==nums.length-1)
//                return nums[i];
//            if(nums[i]!=nums[i+1])
//                return nums[i];
//            i++;
//        }
//        return -1;

/*
Bitwise Xor operation explanation
5 ^ 5 = 0-- > same gives 0
6 ^ 7 != 0-- > different gives 1
(a ^ b) = (b ^ a)
(a ^ b) ^ c = a ^ (b ^ c)
a ^ b ^ c ^ a = b ^ c-- > here element a^a = 0 thus only b ^ c is left
also for our question
{   a, b, c, c, d, b    }
a ^ b ^ (c ^ c) ^ d ^ b-- > a ^ b ^ d ^ b-- > a ^ (d ^ d) ^ (b ^ b)-- > a
*/
        int res = 0;
        for (int i : nums)
            res = res ^ i;
        return res;

    }
}

public class Easy136 {
    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5};
        Solution136 obj = new Solution136();
        System.out.println(obj.singleNumber(n));
    }
}
