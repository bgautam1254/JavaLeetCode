package LeetCode;
import java.util.Arrays;

class Solution242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        char[] sc = s.toCharArray();
        char[] st = t.toCharArray();
        Arrays.sort(sc);
        Arrays.sort(st);
        if (Arrays.compare(sc, st) == 0)
            return true;
        return false;
    }
}

public class Easy242 {
    public static void main(String[] args) {
        String s = "abc", t = "asf";
        Solution242 obj = new Solution242();
        System.out.println(obj.isAnagram(s,t));
    }
}