package LeetCode;
class Solution326 {
    public boolean isPowerOfThree(int n) {
//        if(n<1||(n>1&&(n%3==1||n%3==2)))  return false;
//        return n==1||isPowerOfThree(n/3);



        return (n-1==(n ^ 1));
    }
}
public class Easy326 {
    public static void main(String[] args) {
        int a=5;
        Solution326 obj = new Solution326();
        System.out.println(obj.isPowerOfThree(a));
    }
}
