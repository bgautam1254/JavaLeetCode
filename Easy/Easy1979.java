package LeetCode;

class Solution1979 {
    public int findGCD(int[] nums) {
        int min=nums[0],max=nums[0],i;
        for(i=0;i<=nums.length-1;i++){
            if(nums[i]<min)                   //used to find the smallest number
                min=nums[i];
            if(nums[i]>max)                   //used to find the largest number
                max=nums[i];
        }
        while(max%min!=0){
            i=max%min;                          //Euclid division to find gcf
            max=min;
            min=i;
        }
        return min;
    }
}
public class Easy1979 {
    public static void main(String[] args) {
        int[] n={10,6,9};
        Solution1979 obj= new Solution1979();
        System.out.println(obj.findGCD(n));
    }
}
