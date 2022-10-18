package LeetCode;

class Solution58 {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int i;
        for(i=s.length()-1; i>=0; i--) {
            if (s.charAt(i) == ' ')
                break;
        }

        s=s.substring(i+1,s.length());
        System.out.print("The last word is "+s+" with length ");
        return s.length();
    }
}

public class Easy58 {
    public static void main(String[] args) {
        String s="a";
        Solution58 obj =new Solution58();
        System.out.print(obj.lengthOfLastWord(s));
    }
}
