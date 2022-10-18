package LeetCode;

class Solution509 {
    public int fib(int n) {
//        int a=0, b=1, c, i=1;
//        while(i<=n){
//            c=a+b;
//            a=b;
//            b=c;
//            i++;
//        }

        if (n <=1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
}

public class Easy509 {
    public static void main(String[] args) {
        int s = 5;
        Solution509 obj = new Solution509();
        System.out.println(obj.fib(s));
    }
}
