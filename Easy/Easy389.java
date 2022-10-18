package LeetCode;

class Solution389 {
    public char findTheDifference(String s, String t) {
        int ssum=0, tsum=0;
        for (int i=0;i<s.length();i++)  ssum +=s.codePointAt(i);    //sum of all ASCII(Decimal) value of all characters of String s
        for (int i=0;i<t.length();i++)  tsum +=t.codePointAt(i);    //sum of all ASCII(Decimal) value of all characters of String t
        return (char)(tsum-ssum);       //convert ASCII code to character and return it

//        int ssum=0, tsum=0;
//        for (int i=0;i<s.length();i++) {
//            ssum += s.codePointAt(i);       //sum of all ASCII(Decimal) value of all characters of String s
//            tsum += t.codePointAt(i);      //sum of all ASCII(Decimal) value of all characters of String t
//        }
//        tsum +=t.codePointAt(t.length()-1); //Last index sum
//        return (char)(tsum-ssum);       //convert ASCII code to character and return it

//        while(t.length()>1){
//            char c=s.charAt(0);
//            s=s.replaceFirst(String.valueOf(c),"");     //Replace all char in String s to ""
//            t=t.replaceFirst(String.valueOf(c),"");     //Replace all char in String t from String S to ""
//        }
//        return t.charAt(0);     //Return left char in String t which is not present in String s
    }
}
public class Easy389 {
    public static void main(String[] args) {
        String s = "av", t = "dav";
        Solution389 obj = new Solution389();
        System.out.println(obj.findTheDifference(s,t));
    }
}
