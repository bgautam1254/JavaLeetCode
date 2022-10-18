package LeetCode;

class Solution1071 {
    public String gcdOfStrings(String str1, String str2) {
//        if (str2.length() > str1.length())
//            return gcdOfStrings(str2, str1);
//
//        if (str2.matches(str1))
//            return str2;
//
//        if (str1.startsWith(str2))
//            return gcdOfStrings(str1.substring(str2.length()), str2);
//        return "";

        int i,a=str1.length(),b=str2.length();
            while (a % b != 0) {        //I used this to find the highest common factor-->b
                i = a % b;
                a = b;
                b = i;
            }

        for (i = 0;  i<= str1.length()-b; i+=b){
            if (i<= str1.length()-b && !str1.regionMatches(i, str2, 0, b))      //checks if substring of length-b repeat in str 1
                return "";
            if (i<= str2.length()-b && !str2.regionMatches(i, str2, 0, b))      //checks if substring of length-b repeat in str 2
                return "";
            }
        return str2.substring(0,b);
    }
}
public class Easy1071 {
    public static void main(String[] args) {
        String a="TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX";
        String b="TAUXXTAUXXTAUXXTAUXXTAUXX";
        Solution1071 obj=new Solution1071();
        System.out.println(obj.gcdOfStrings(a,b));
    }
}