package LeetCode;

class Solution409 {
    public int longestPalindrome(String s) {
        int i=0,b=0,c=0;
        while(s.length()>0) {
            b=s.length();
            s = s.replaceAll(String.valueOf(s.charAt(0)), "");
            b -= s.length();
            if (b % 2 == 0)
                c += b;
            else{
                c +=b-1;
                i++;
            }
        }
        if(i>0)
            return c+1;
        return c;
    }
}
public class Easy409 {
    public static void main(String[] args) {
        String s="aaa";
        Solution409 obj = new Solution409();
        System.out.println(obj.longestPalindrome(s));
    }
}
