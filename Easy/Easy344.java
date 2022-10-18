package LeetCode;

class Solution344 {
    public void reverseString(char[] s) {
        int l=s.length; char k;
        for(int i=0; i<=(l/2)-1;i++){
            k=s[l-1-i];
            s[l-1-i]=s[i];
            s[i]=k;
        }

    }
}

public class Easy344 {
    public static void main(String[] args) {
        char[] s={'h','e','l','l','o'};
        Solution344 obj =new Solution344();
        obj.reverseString(s);
    }
}
