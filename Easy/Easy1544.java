package LeetCode;

import java.util.ArrayList;

class Solution1544 {
    public String makeGood(String s) {
//        long x,y;
//        x=System.nanoTime();
//        StringBuilder ss = new StringBuilder(s);
//        for (int i = 0; i <= ss.length() - 2; i++)
//            if (ss.codePointAt(i)+32 == ss.codePointAt(i + 1) ||
//                    ss.codePointAt(i)-32 == ss.codePointAt(i + 1)) {
//                ss.delete(i, i + 2);
//                i =- 1;
//            }
//        System.out.println(ss.toString());
//        y=System.nanoTime();
//        System.out.println(y-x);

        long x,y;
        x=System.nanoTime();
        StringBuilder ss = new StringBuilder(s);
        for (int i = 0; i <= ss.length() - 2; i++)
            if (ss.charAt(i)+32 == ss.charAt(i + 1) ||
                    ss.charAt(i)-32 == ss.charAt(i + 1)) {
                ss.delete(i, i + 2);
                i =- 1;
            }
        System.out.println(ss.toString());
        y=System.nanoTime();
        System.out.println(y-x);

        return ss.toString();
    }
}

public class Easy1544 {
    public static void main(String[] args) {
        String s = "abBAcC";
        Solution1544 obj = new Solution1544();
        System.out.println(obj.makeGood(s));
    }
}