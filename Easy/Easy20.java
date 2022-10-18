package LeetCode;

class Solution20 {
    public boolean isValid(String s) {
        boolean z = false;
        if (s.length() % 2 == 0) {
            for (int i = 1; i <= s.length()-1; i++) {
                if ((s.charAt(i - 1) == '(' && s.charAt(i) == ')') ||
                        (s.charAt(i - 1) == '{' && s.charAt(i) == '}') ||
                        (s.charAt(i - 1) == '[' && s.charAt(i) == ']')) {
                    s = s.replaceAll("\\(\\)", "");
                    s = s.replaceAll("\\{}", "");
                    s = s.replaceAll("\\[]", "");
                    i = 0;
                    if (s == "") {
                        z = true;
                        break;
                    }
                }
            }

        }
        return z;
    }

    public static void main(String[] args) {
        String s = "((";
        Solution20 obj = new Solution20();
        System.out.println(obj.isValid(s));
    }
}
