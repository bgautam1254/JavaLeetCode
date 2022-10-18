package LeetCode;

class Solution844 {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder s1 = new StringBuilder(s);
        StringBuilder s2 = new StringBuilder(t);

        for (int i = 0; i <= s1.length() - 1; i++) {
            if (s1.charAt(i) == '#') {
                if (i == 0) {
                    s1.replace(i, i + 1, "");
                    i = -1;
                } else {
                    s1.replace(i - 1, i + 1, "");
                    i = i - 2;
                }
            }
        }

        for (int i = 0; i <= s2.length() - 1; i++) {
            if (s2.charAt(i) == '#') {
                if (i == 0) {
                    s2.replace(i, i + 1, "");
                    i = -1;
                } else {
                    s2.replace(i - 1, i + 1, "");
                    i = i - 2;
                }
            }
        }
        return s1.toString().equals(s2.toString());
    }
}

public class Easy844 {
    public static void main(String[] args) {
        String s = "y#fo##f", t = "y#f#o##f";
        Solution844 obj = new Solution844();
        System.out.println(obj.backspaceCompare(s, t));
    }
}
