package LeetCode;

class Solution28 {
    public int strStr(String haystack, String needle) {
        if (needle == "")
            return 0;
        return haystack.indexOf(needle);
    }
}

public class Medium28 {
    public static void main(String[] args) {
        String h = "f", n = "dsf";
        Solution28 obj = new Solution28();
        System.out.println(obj.strStr(h,n));
    }
}
