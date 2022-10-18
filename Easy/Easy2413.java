package LeetCode;

class Solution2413 {
    public int smallestEvenMultiple(int n) {
        if(n%2==1)
            return n*2;
        return n;
    }
}

public class Easy2413 {
    public static void main(String[] args) {
        int n=5;
        Solution2413 obj=new Solution2413();
        System.out.println(obj.smallestEvenMultiple(n));
    }
}
