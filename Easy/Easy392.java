package LeetCode;

class Solution392 {
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length())
            return false;
        if(s.length()==0)       //if string s is empty
            return true;

        char[] ss=s.toCharArray();  //convert string to char array
        char[] tt=t.toCharArray();

        int j=0;

        for (int i=0;i<=tt.length-1;i++)
            if (ss[j] == tt[i]) {
                j++;
                if (j == ss.length)
                    return true;
            }
        return false;

//        if(s.length()>t.length())
//            return false;
//        if(s.length()==0)
//            return true;
//
//        int j=0;
//        for (int i=0;i<=t.length()-1;i++)
//            if (s.charAt(j) == t.charAt(i)) {
//                j++;
//                if (j == s.length())
//                    return true;
//            }
//        return false;

    }
}
public class Easy392 {
    public static void main(String[] args) {
        String s = "", t = "abc";
        Solution392 obj = new Solution392();
        System.out.println(obj.isSubsequence(s,t));
    }
}