package LeetCode;
import java.util.Arrays;

class Solution283 {
    public void moveZeroes(int[] nums) {
//        int k = 0;
//        for (int i = 0; i <= nums.length - 2; i++){
//            if(i==nums.length - k)
//                break;
//            if (nums[i] == 0) {
//                k++;
//                for (int j = i; j <= nums.length - 2; j++)
//                    nums[j] = nums[j + 1];
//                nums[nums.length - k] = 0;
//                if(nums[i]==0)
//                    i--;
//            }
//    }
//        System.out.println(Arrays.toString(nums));

        if(nums.length==1)                      //checks if array is of length 1
            return;
        for (int j=0, i=1; i<=nums.length-1; i++) {
            if(nums[j]!=0)                     //if element is non zero then checks next element
                j++;
            if (nums[j] == 0 && nums[i]!=0) {   //if element is zero also checks if next element is nonzero
                nums[j]=nums[i];                //simply swaps zero element with next non-zero element
                nums[i]=0;                      //next non-zero element to zero
                j++;                            //j++-->to check next zero element
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}

public class Easy283 {
    public static void main(String[] args) {
        int[] nums = {1,0,1};
//        2,5,6,0};
        Solution283 obj = new Solution283();
        obj.moveZeroes(nums);
    }

}
