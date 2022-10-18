package LeetCode;

class Solution796 {
    public boolean rotateString(String s, String goal) {
        boolean r = false;
        int l = s.length();
        String k;
        for (int i = 0; i <= l - 1; i++) {
            k = s.substring(0, 1);
            s = s.replaceFirst(k,"") + k;
            if (s.equals(goal)) {
                r = true;
                break;
            }
        }
        return r;
    }
}


public class Easy796 {
    public static void main(String[] args) {
        String s = "abcde", g = "cdeab";
        Solution796 obj = new Solution796();
        System.out.println(obj.rotateString(s, g));
    }
}
