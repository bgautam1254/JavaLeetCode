package LeetCode;

import java.util.Arrays;

class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int a = 0;
        for (int i = l1 - l2; i < l1; i++) {
            nums1[i] = nums2[a];
            a++;
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}


public class Easy88 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        Solution88 obj = new Solution88();
        obj.merge(nums1, m, nums2, n);
    }
}
