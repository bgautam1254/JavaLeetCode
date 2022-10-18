package LeetCode;

import ZRaw.RawFiles.Array;

import java.util.Arrays;

class Solution27 {
    public int removeElement(int[] nums, int val) {

        Arrays.sort(nums);      //sort the array
        int index = Arrays.binarySearch(nums, val); //find index of val in array using binarysearch
        if (index < 0)              //if val not present then simply returns length of nums-array
            return nums.length;

        int s = index, e = index;
        while (nums[s] == val) {            //find starting-occurrence-index of val
            if (s == 0) {
                s = s - 1;
                break;
            }
            s = s - 1;
        }
        while (nums[e] == val) {            //find ending-occurrence-index of val
            if (e == nums.length - 1) {
                e = e + 1;
                break;
            }
            e = e + 1;
        }

        for (int i = s + 1; i <= e - 1; i++)            //changing values of all occurence of val
            nums[i] = nums[nums.length - 1] + 1;

        Arrays.sort(nums);
        return (nums.length) - e + s + 1;
    }
}

public class Easy27 {
    public static void main(String[] args) {
        int[] nums = {};
        int val = 2;
        Solution27 obj = new Solution27();
        System.out.println(obj.removeElement(nums, val));
    }
}
