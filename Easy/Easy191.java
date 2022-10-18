package LeetCode;

class Solution191 {
    public int hammingWeight(int n) {
//        return Integer.toBinaryString(n).replaceAll("0","").length();
//        String s=Integer.toBinaryString(n);
//        System.out.println(s);
//        int k=0;
//        for(int i=0;i<=s.length()-1;i++)
//            if(s.charAt(i)=='0')
//                k++;
//        return s.length()-k;
        int c=0;
        for(int i=1;i<=32;i++){
            if((n&1)==1)
                c++;
            n>>=1;
        }
        return c;
    }
}
public class Easy191 {
    public static void main(String[] args) {
        int n=3;
        Solution191 obj =new Solution191();
        System.out.println(obj.hammingWeight(n));
    }
}
