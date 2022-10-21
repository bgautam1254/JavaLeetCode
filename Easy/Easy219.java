package LeetCode;
import java.util.HashMap;

class Solution219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= nums.length - 1; i++) {
            if (map.containsKey(nums[i]) && Math.abs(map.get(nums[i]) - i) <= k)
                return true;
            map.put(nums[i], i);
        }
        return false;
    }
}

public class Easy219 {
    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 1};
        int k = 1;
        Solution219 obj = new Solution219();
        System.out.println(obj.containsNearbyDuplicate(nums, k));
    }
}
