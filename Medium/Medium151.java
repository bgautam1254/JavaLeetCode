package LeetCode;

class Solution151 {
    public String reverseWords(String s) {
//        StringBuilder ss=new StringBuilder();
//        s=s.trim().replaceAll("[ ]{2,}"," ");
//        String[] sk= s.split(" ");
//        for(int i=sk.length-1;i>=0;i--)
//            ss.append(sk[i]).append(" ");
//        return ss.toString().stripTrailing();
        StringBuilder ss=new StringBuilder(s.trim().replaceAll("[ ]{2,}"," "));
        StringBuilder sk=new StringBuilder();
        int k=ss.length()-1;

        while (k>-1) {
            int a=ss.lastIndexOf(" ",k);
            sk.append(ss.substring(a+1,k+1)).append(" ");
            k=ss.lastIndexOf(" ",a-1);
        }
        return sk.toString().stripTrailing();
    }
}
public class Medium151 {
    public static void main(String[] args) {
        String s = "the  sky    is blue";
        Solution151 obj=new Solution151();
        System.out.println(obj.reverseWords(s));
    }
}
