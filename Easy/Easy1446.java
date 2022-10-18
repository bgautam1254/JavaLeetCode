package LeetCode;

class Solution1446 {
    public int maxPower(String s) {
        if (s.length() == 1)
            return 1;
        int k = 1, l = 1;
        char[] c = s.toCharArray();
        for (int i = 0; i <= s.length() - 2; i++) {
            if (c[i] == c[i + 1]) {
                k++;
                if ((i + 1 == s.length() - 1) && k > l)
                    return k;
            } else if (k > l) {
                l = k;
                k = 1;
            } else k = 1;
        }
        return l;
    }
}

public class Easy1446 {
    public static void main(String[] args) {
        String s = "abbcccddddeeeeedcba";
        Solution1446 obj = new Solution1446();
        System.out.println(obj.maxPower(s));
    }
}