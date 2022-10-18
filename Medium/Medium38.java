package LeetCode;

class Solution38 {
    public String countAndSay(int n) {
        int i = 1;
        StringBuilder ss = new StringBuilder("1");
        while (++i <= n)
            ss = nstring(ss);
        return ss.toString();
    }

    StringBuilder nstring(StringBuilder ss) {
        StringBuilder sk = new StringBuilder();
        int i = 0, count = 1;
        while (i < ss.length() - 1) {
            if (ss.charAt(i) == ss.charAt(i + 1))
                count++;
            else {
                sk.append(count).append(ss.charAt(i));
                count = 1;
            }
            i++;
        }
        return sk.append(count).append(ss.charAt(ss.length() - 1));
    }

}

public class Medium38 {
    public static void main(String[] args) {
        int n = 6;
        Solution38 obj = new Solution38();
        System.out.println(obj.countAndSay(n));
    }
}