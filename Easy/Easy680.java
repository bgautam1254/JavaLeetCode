package LeetCode;
class Solution680 {
    public boolean validPalindrome(String s) {
//        StringBuilder ss = new StringBuilder(s);
//        StringBuilder sk = new StringBuilder(s);
//        int n = 0, a = 0, b = 0;
//        for (int i = 0; i < ss.length() / 2; i++) {
//            if (a > 0) {
//                if (ss.charAt(i) != ss.charAt(ss.length() - 1 - i))
//                    return false;
//            }
//            else if (b > 0) {
//                if (sk.charAt(i) != sk.charAt(ss.length() - 1 - i))
//                    return false;
//            }
//            else if (ss.charAt(i) == ss.charAt(ss.length() - 1 - i) && sk.charAt(i) != sk.charAt(ss.length() - 1 - i))
//                a = 1;
//            else if (ss.charAt(i) != ss.charAt(ss.length() - 1 - i) && sk.charAt(i) == sk.charAt(ss.length() - 1 - i))
//                b = 1;
//            else if (ss.charAt(i) != ss.charAt(ss.length() - 1 - i) && sk.charAt(i) != sk.charAt(ss.length() - 1 - i)) {
//                n++;
//                if (n > 1)
//                    return false;
//                ss.deleteCharAt(i);
//                sk.deleteCharAt(sk.length()-1-i);
//                i--;
//            }
//        }
//        return true;

//        int n1 = 0, n2 = 0;
//        int ss = 0, ee = s.length() - 1;
//        char[] c=s.toCharArray();
//        while (ss < ee) {
//            if (c[ss] != c[ee--]) {
//                if (++n1 > 1)
//                    break;
//            }
//            else
//                ss++;
//        }
//        ss = 0;
//        ee = s.length() - 1;
//        while (ss < ee) {
//            if (c[ss++] != c[ee]) {
//                if (++n2 > 1)
//                    break;
//            }
//            else
//                ee--;
//        }
//        return n1 != 2 || n2 != 2;

        int n1 = 0, n2 = 0;
        int ss = 0, ee = s.length() - 1;
        while (ss < ee) {
            if (s.charAt(ss) != s.charAt(ee--)) {
                if (++n1 > 1){
                    ss = 0;
                    ee = s.length() - 1;
                    break;
                }
            }
            else
                ss++;
        }

        while (ss < ee) {
            if (s.charAt(ss++) != s.charAt(ee)) {
                if (++n2 > 1)
                    break;
            }
            else
                ee--;
        }
        return n1 != 2 || n2 != 2;
    }
}

public class Easy680 {
    public static void main(String[] args) {
        String s = "abcda";
        Solution680 obj = new Solution680();
        System.out.println(obj.validPalindrome(s));
    }
}