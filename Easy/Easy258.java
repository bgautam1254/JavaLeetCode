package LeetCode;

class Solution258 {
    public int addDigits(int num) {
        if(num<10)          return num;
        if (num%9==0)       return 9;           //logic created for digitsum
        else return num%9;
    }
}
public class Easy258 {
    public static void main(String[] args) {
        System.out.println(9%9);
        int n=897;
        Solution258 obj= new Solution258();
        System.out.println(obj.addDigits(n));
    }
}
