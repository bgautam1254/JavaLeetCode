package LeetCode;
import java.util.HashSet;

class Solution859 {
    public boolean buddyStrings(String s, String goal) {
        if(s.length()!=goal.length())
            return false;
        int c=0,d=1,l=0;
        char[] a=new char[2];
        int[] b=new int[2];
        HashSet<Character> h = new HashSet<>();
        for (int i=0; i<=s.length()-1; i++) {
            if(s.charAt(i)!=goal.charAt(i)) {
                if (++c > 2)
                    return false;
                a[l]=s.charAt(i);
                b[l++]=i;
            }
            if (h.contains(s.charAt(i)))
                d++;
            else
                h.add(s.charAt(i));
        }
        if(c==2)
            return a[0] == goal.charAt(b[1]) && a[1] == goal.charAt(b[0]);
        return (c==0 && d!=1);
    }
}

public class Easy859 {
    public static void main(String[] args) {
        String s = "ab", goal = "ba";
        Solution859 obj =new Solution859();
        System.out.println(obj.buddyStrings(s,goal));
    }
}
