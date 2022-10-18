package LeetCode;

class Solution224 {
    public int bracketSolver(String ss) {
        int ans = 0, res = 0, sign = 0;
        for (int i = 0; i <= ss.length() - 1; i++) {
            if (Character.isDigit(ss.charAt(i))) {
                ans = (ans * 10) + (ss.charAt(i) - 48);
                if (i == ss.length() - 1 || ss.charAt(i + 1) == '+' || ss.charAt(i + 1) == '-') {
                    if (sign == 1) {
                        ans = -ans;
                        sign = 0;
                    }
                    res += ans;
                    ans = 0;
                }
            } else if (ss.charAt(i) == '-')
                sign = 1;
        }
        return res;
    }

    public int calculate(String s) {
        StringBuilder ss = new StringBuilder(s.replaceAll(" ", ""));
        int ei, si, res;
        while (ss.indexOf(")") >= 0) {
            ei = ss.indexOf(")");
            si = ss.lastIndexOf("(", ei);
            res = bracketSolver(ss.substring(si + 1, ei));
            if (si - 1 >= 0 && ss.charAt(si - 1) == '-') {
                res = -res;
                si = si - 1;
            } else if (si - 1 >= 0 && ss.charAt(si - 1) == '+')
                si = si - 1;
            if (res >= 0)
                ss.replace(si, ei + 1, "+" + res);
            else
                ss.replace(si, ei + 1, String.valueOf(res));
        }
        return bracketSolver(ss.toString());
    }
}

public class Hard224 {
    public static void main(String[] args) {
        String s = "1-(     -2)";
        Solution224 obj = new Solution224();
        System.out.println(obj.calculate(s));
    }
}