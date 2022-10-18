package LeetCode;
import java.util.Arrays;
class Solution35 {
    public int searchInsert(int[] nums, int target) {
        target=Arrays.binarySearch(nums,target);
        if(target<0) target=-target-1;
        return target;
    }
}

public class Easy35 {
    public static void main(String[] args) {

        int[] a ={1,3,5,6,9,65,66,78};
        int b = -8;

        Solution35 obj = new Solution35();
        System.out.println(obj.searchInsert(a, b));
    }
}