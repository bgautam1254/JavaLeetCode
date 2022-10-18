package LeetCode;

class Solution1004 {
    public int longestOnes(int[] nums, int k) {
        int c = 0;
        for (int i = 0; i <= nums.length - 1; i++) {
            if (k == 0) {               //if k=0 than checks for continuous 1
                if(nums[i]==1)
                    c++;
                else c=0;
                if(c>nums[0])
                    nums[0] = c;
            }
            else if (nums[i] == 0)      //indexes 0f all 0s are saved to same array
                nums[c++] = i;
        }
        if(k==0)                        //if k=0 than return number of continuous 1
            return nums[0];

        if (c == nums.length)             //if all elements are 0
            return k;
        if (c <= k)                       //if no of 0s <= k
            return nums.length;

        nums[c] = nums[k];                //here i saved comparison value for the length
        for (int i = 0; i <= c - k + i; i++) {
            if (k+1 == c && nums.length - 1 - nums[i] > nums[c])    //checks the last element and length
                return nums.length - 1 - nums[i];
            else if (k+1 == c) break;
            if (nums[++k] - nums[i] - 1 > nums[c])          //overall main code to count length
                nums[c] = nums[k] - nums[i] - 1;
        }
        return nums[c];

//        int c = 0;
//        for (int i = 0; i <= nums.length - 1; i++) {
//            if (k == 0) {                   //if k=0 than checks for continuous 1
//                if (nums[i] == 1) {
//                    c++;
//                    if (i == nums.length - 1 && c > nums[0])
//                        return c;
//                } else if (c > nums[0]) {
//                    nums[0] = c;
//                    c = 0;
//                } else c = 0;
//                if (i == nums.length - 1)
//                    return nums[0];
//            } else if (nums[i] == 0)      //indexes 0f all 0s are saved to same array
//                nums[c++] = i;
//        }
//
//        if (c == nums.length)             //if all elements are 0
//            return k;
//        if (c <= k)                       //if no of 0s <= k
//            return nums.length;
//
//        nums[c] = nums[k];
//        for (int i = 0; i <= c - k + i; i++) {
//            if (k+1 == c && nums.length - 1 - nums[i] > nums[c])
//                return nums.length - 1 - nums[i];
//            else if (k+1 == c) break;
//            if (nums[++k] - nums[i] - 1 > nums[c])
//                nums[c] = nums[k] - nums[i] - 1;
//        }
//        return nums[c];


    }
}

public class Medium1004 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,0,0};
        int k = 0;
        Solution1004 obj = new Solution1004();
        System.out.println(obj.longestOnes(nums, k));
    }
}