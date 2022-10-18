package LeetCode;

class Solution1790 {
    public boolean areAlmostEqual(String s1, String s2) {
        int c=0,l=0;
        char[] a=new char[2];           //store unmatched characters
        int[] b=new int[2];             //store unmatched characters index
        for (int i=0; i<=s1.length()-1; i++) {
            if(s1.charAt(i)!=s2.charAt(i)) {
                if (++c > 2)             //if unmatched characters
                    return false;        //are greater than 2 then returns false
                a[l]=s1.charAt(i);       //store unmatched characters
                b[l++]=i;                //store unmatched characters index
            }
        }
        if(c==2)            //if 2 unmatched characters then checks for the swap of characters
            return a[0] == s2.charAt(b[1]) && a[1] == s2.charAt(b[0]);
        return c==0;                     //if no unmatched characters then true
    }
}
public class Easy1790 {
    public static void main(String[] args) {
        String s1 = "bank", s2 = "kanb";
        Solution1790 obj=new Solution1790();
        System.out.println(obj.areAlmostEqual(s1,s2));
    }
}