package LeetCode;

class Solution704 {
    public int search(int[] nums, int target) {
        int s = 0, m, e = nums.length - 1;
        m = s + (e - s) / 2;

        for (int i = 0; i <= nums.length; i++) {
            if (nums[m] == target) {
                return m;
            }
            else if (target < nums[m])
                e = m - 1;
            else
                s = m + 1;
            m = s + (e - s) / 2;
            if (s > e)
                return -1;
        }
        return m;
    }
}

public class Easy704 {
    public static void main(String[] args) {
        int[] arr ={-12,-11,-10,-7,-2,-1,2,3,4,5,6,7,8,9,10};
        int target = 0;
        Solution704 obj = new Solution704();
        System.out.println(obj.search(arr,target));
    }
}