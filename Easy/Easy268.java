package LeetCode;
import java.util.Arrays;
import java.util.stream.IntStream;

class Solution268 {
    public int missingNumber(int[] nums) {
//        Arrays.sort(nums);
//        if(nums.length-1==nums[nums.length-1])
//            return nums.length;
//        else if (0 != nums[0])
//            return 0;
//        int l=nums.length/2,s=0,e=nums.length;
//        while(nums.length>0){
//            if(l!=nums[l]){
//                if (l - 1 == nums[l - 1])
//                    return l;
//                e=l;
//            }
//            else
//                s=l;
//            l=(s+e)/2;
//        }
//        return l;

//        int sum=0;
//        for(int i:nums) sum+=i;
//        return (nums.length*(nums.length+1)/2)-sum;     //in return i used sum of n number AP formula

        int arrsum=0;
        for(int i:nums) arrsum+=i;
        return (nums.length*(nums.length+1)/2)-arrsum;
    }
}

public class Easy268 {
    public static void main(String[] args) {
        int[] a = {2};
        Solution268 obj = new Solution268();
        System.out.println(obj.missingNumber(a));
    }
}
