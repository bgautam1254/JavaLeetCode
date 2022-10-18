package LeetCode;

import java.util.ArrayList;

class Solution345 {
    public String reverseVowels(String s) {
//        StringBuilder b = new StringBuilder();
//        StringBuilder c = new StringBuilder(s);
//        ArrayList q=new ArrayList();
//
//        for (int i = 0; i <= s.length() - 1; i++) {
//            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'
//            ||s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
//                q.add(i);
//                b.append(s.charAt(i));
//            }
//        }
//        b.reverse();
//        int k;
//        for (int i = 0; i <= q.size()-1; i++) {
//            k = (int) q.get(i);
//            c.deleteCharAt(k).insert(k,b.charAt(i));
//        }
//        return String.valueOf(c);

        StringBuilder b = new StringBuilder();
        StringBuilder c = new StringBuilder(s);
        ArrayList q=new ArrayList();

        for (int i = 0; i <= s.length() - 1; i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'
            ||s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
                q.add(i);
                b.append(s.charAt(i));
            }
        }
        b.reverse();
        int k;
        for (int i = 0; i <= q.size()-1; i++) {
            k = (int) q.get(i);
            c.deleteCharAt(k).insert(k,b.charAt(i));
        }
        return String.valueOf(c);
    }
}

public class Easy345 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        Solution345 obj = new Solution345();
        System.out.println(obj.reverseVowels(s));
    }
}
