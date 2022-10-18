package LeetCode;

class Solution11 {
    public int maxArea(int[] height) {

        int sum=0,i=0,j=height.length-1;
        while (i<j){
            sum=Math.max(sum,Math.min(height[i],height[j])*(j-i));
            if(height[i]<height[j])
                i++;
            else
                j--;
        }
        return sum;

    }
}

public class Medium11 {
    public static void main(String[] args) {
        int[] h={2,3,4,5,18,17,6};
//        int[] h={0,1,2,3, 4, 5,6};
        Solution11 obj= new Solution11();
        System.out.println(obj.maxArea(h));
    }
}