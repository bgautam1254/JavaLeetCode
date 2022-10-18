package LeetCode;

class Solution2119 {
    public boolean isSameAfterReversals(int num) {
        return !(num>0&&num%10==0);
    }
}
public class Easy2119 {
    public static void main(String[] args) {
        int n=18001;
        Solution2119 obj=new Solution2119();
        System.out.println(obj.isSameAfterReversals(n));
    }
}
