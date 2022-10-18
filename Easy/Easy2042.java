package LeetCode;

class Solution2042 {
    public boolean areNumbersAscending(String s) {
        s=s.replaceAll("[a-z]","").trim();
        int i=0,a,b=0,k=0;
        while(i<s.length()){
            if(Character.isDigit(s.charAt(i))) {
                a = s.codePointAt(i) - 48;
                k = k * 10 + a;
                if (i == s.length() - 1||s.charAt(i + 1) == ' ') {
                    if (k <= b)
                        return false;
                    b = k;
                    k = 0;
                    i++;
                }
            }
            i++;
        }
        return true;
    }
}
public class Easy2042 {
    public static void main(String[] args) {
        String s = "sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s";
        Solution2042 obj = new Solution2042();
        System.out.println(obj.areNumbersAscending(s));
    }
}
