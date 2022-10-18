package LeetCode;

class Solution42 {
    public int trap(int[] height) {
        int sum=0,mhi = 0;

        for(int i=0;i<=height.length-1;i++)
            if(height[i]>=sum) {
                sum = height[i];
                mhi=i;
            }

        sum=0;

        int k=height[0],l=height[height.length-1],j=height.length;
        for(int i=0;i<=height.length;i++){
            if(i<=mhi) {
                if (k - height[i] > 0)
                    sum += k - height[i];
                else k = height[i];
            }
            else {
                if (l - height[--j] > 0)
                    sum += l - height[j];
                else l = height[j];
            }
        }
        return sum;
    }
}

public class Hard42 {
    public static void main(String[] args) {
        int[] h = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        Solution42 obj = new Solution42();
        System.out.println(obj.trap(h));
    }
}