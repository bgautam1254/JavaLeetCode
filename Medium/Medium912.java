package LeetCode;
import java.util.Arrays;

class Solution912 {
    public int[] sortArray(int[] nums) {
        Arrays.parallelSort(nums);
        return nums;
    }
}

public class Medium912 {
    public static void main(String[] args) {
        int[] nums={123};
        Solution912 obj=new Solution912();
        System.out.println(Arrays.toString(obj.sortArray(nums)));
    }
}
