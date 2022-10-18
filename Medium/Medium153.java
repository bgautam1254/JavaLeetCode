package LeetCode;

class Solution153 {
    public int findMin(int[] nums) {
        int k=nums[0],i=0,j=nums.length-1;
        if(nums[i]<=nums[j])                            //checks if array is rotated or not
            return nums[i];
        while(i!=j){
            if(k>nums[(i+j)/2])                         //binary search operation type
                j = (i+j)/2;
            else if(k<=nums[(i+j)/2]){
                if(nums[(i+j)/2]>nums[(i+j)/2+1])
                    return nums[(i+j)/2+1];
                k=nums[(i+j)/2];
                i=(i+j)/2;
            }
        }
        return nums[(i+j)/2];
    }
}

public class Medium153 {
    public static void main(String[] args) {
        int[]n={1,2,3,5,8};
        Solution153 obj=new Solution153();
        System.out.println(obj.findMin(n));
    }
}