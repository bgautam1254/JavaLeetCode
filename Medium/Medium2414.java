package LeetCode;

class Solution2414 {
    public int longestContinuousSubstring(String s) {
        int l=1, n=1;
        char[] c=s.toCharArray();
        for(int i=0; i<c.length-1; i++) {
            if(c[i]+1 == c[i+1] )
                n++;
            else n=1;
            if(n>l)
                l = n;
        }
        return l;
    }
}

public class Medium2414 {
    public static void main(String[] args) {
        String s="dsf";
        Solution2414 obj=new Solution2414();
        System.out.println(obj.longestContinuousSubstring(s));
    }
}
