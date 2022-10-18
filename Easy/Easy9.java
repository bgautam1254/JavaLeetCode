package LeetCode;

class Solution {
    public boolean isPalindrome(int x) {
//        if (x < 0)
//            return false;           //if x is negative returns false
//        long k = 0;
//        while (k == x) {
//            k = (k * 10) + (x % 10);        //reverse last digit
//            x = x / 10;
//            if (x <= k)
//                return k == x;
//        }
//        return false;
//        StringBuilder ss=(new StringBuilder(String.valueOf(x)).reverse());
//        return String.valueOf(x).equals(String.valueOf(ss));
        char[] k=String.valueOf(x).toCharArray();
        for (int i=0;i<=k.length/2;i++)
            if(k[i]!=k[k.length-1-i])
                return false;
        return true;
    }
}

public class Easy9 {
    public static void main(String[] args) {
        int a = 121;
        Solution obj = new Solution();
        System.out.println(obj.isPalindrome(a));
    }
}