package LeetCode;
class Solution231 {
    public boolean isPowerOfTwo(int n) {
        if(n<1||(n>1&&n%2==1))  return false;
        return n==1||isPowerOfTwo(n/2);      //2^0=1,also n will be half each time recursively
    }
}
public class Easy231 {
    public static void main(String[] args) {
        int a=536870912;
//        int a=1;
        Solution231 obj = new Solution231();
        System.out.println(obj.isPowerOfTwo(a));
    }
}
