package LeetCode;

class Solution415 {
    public String addStrings(String num1, String num2) {
        int x = num1.length(), y = num2.length(), a = 0;
        StringBuilder p = new StringBuilder();

        num2 = String.format("%" + x + "s", num2).replace(' ', '0');
        num1 = String.format("%" + y + "s", num1).replace(' ', '0');

        for (int i = num1.length() - 1; i >= 0; i--) {
            a += num1.codePointAt(i) + num2.codePointAt(i) - 96;
            if (i == 0) break;
            p.insert(0, (a % 10));
            a = a / 10;
        }
        return a + p.toString();
    }
}

public class Easy415 {
    public static void main(String[] args) {
        String a = "1098765423", b="0119577543";
        Solution415 obj = new Solution415();
        System.out.println(obj.addStrings(a, b));
    }
}
