package LeetCode;

class Solution1422 {
    public int maxScore(String s) {

        int z=0, l0=0, l1=s.replaceAll("0","").length();
        for(int i=0; i<=s.length()-2;i++){
            if(s.charAt(i)=='0')  l0++;
            else                l1--;
            if(l0+l1>z)         z=l0+l1;
        }
        return z;

            /*          Time taking algorithm               */
//        int x,y,z=0;
//        for (int i = 0; i <= s.length()-2; i++) {
//            x= s.substring(0,i+1).replaceAll("1","").length();
//            y= s.substring(i+1).replaceAll("0","").length();
//            if(x+y>z)
//                z=x+y;
//        }
//        return z;


    }
}

public class Easy1422 {
    public static void main(String[] args) {
        String s = "0000";
        Solution1422 obj = new Solution1422();
        System.out.println(obj.maxScore(s));
    }
}
