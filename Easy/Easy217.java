package LeetCode;
import java.util.Arrays;

class Solution217 {
    public boolean containsDuplicate(int[] nums) {
//        Arrays.sort(nums);
//        for(int i=0;i<=nums.length-2;i++)
//            if(nums[i]==nums[i+1])
//                return true;
//        return false;

        Arrays.sort(nums);
        for(int i=0;i<=nums.length-2;i++)
            if(nums[i]==nums[i+1])
                return true;
        return false;
    }
}
public class Easy217 {
    public static void main(String[] args) {
        String k="123";
        k=k+'1';
        System.out.println(k);


        int[] a={1,2,3,4};
        Solution217 obj=new Solution217();
        System.out.println(obj.containsDuplicate(a));
    }
}
