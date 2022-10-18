package LeetCode;

class Solution190 {
    public int reverseBits(int n) {
        int ans=0,i=1;
        while(i<=32){
            ans=(ans<<1)+(n&1);
            n=n>>1;
            i++;
        }
        return ans;
    }
}
public class Easy190 {
    public static void main(String[] args) {
//        int a=11000000110100001111010101010101;
        int a=12;
        Solution190 obj = new Solution190();
        System.out.println(obj.reverseBits(a));
    }
}
