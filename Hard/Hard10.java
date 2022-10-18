package LeetCode;

import java.util.Arrays;

class Solution10 {
    public boolean isMatch(String s, String p) {
        return s.matches(p);
    }
}

public class Hard10 {
    public static void main(String[] args) {
        String s = "ab", p = ".*";
        Solution10 obj = new Solution10();
        System.out.println(obj.isMatch(s, p));
    }
}
