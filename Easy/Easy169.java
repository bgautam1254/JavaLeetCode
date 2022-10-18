package LeetCode;

import ZRaw.RawFiles.Array;

import java.util.Arrays;

class Solution169 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n=nums[0],k=0;
        for(int i=0;i<=nums.length-1;i++){
            if(n!=nums[i]) {
                k = 0;
                n=nums[i];
            }
            k++;
            if(k>nums.length/2) {
                k= nums[i];
                break;
            }
        }
        return k;
    }
}
public class Easy169 {
    public static void main(String[] args) {
        int[] a={3,2,3};
        Solution169 obj = new Solution169();
        System.out.println(obj.majorityElement(a));
    }
}
