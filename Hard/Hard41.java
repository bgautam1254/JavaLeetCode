package LeetCode;
import java.util.Arrays;

class Solution41 {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int k = Arrays.binarySearch(nums, 0);
        System.out.println(k);
        int i = 1, j = 0;

        if (k < -1)
            k = -k - 2;
        System.out.println(k);


        while (k + i <= nums.length - 1) {
            if (nums[k + i] == j)
                i++;
            else if (nums[k+i]==j+1) {
                i++;
                j++;
            }
            else if (nums[k+i]>j+1)
                return j+1;
        }
        return j+1;
    }
}

public class Hard41 {
    public static void main(String[] args) {
        int[] nums = {0,1,1,2,2};
        Solution41 obj = new Solution41();
        System.out.println(obj.firstMissingPositive(nums));
    }
}
