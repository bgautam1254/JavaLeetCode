package LeetCode;
import java.util.Objects;

class Solution8 {
    public int myAtoi(String s) {
        s=s.stripLeading();
        if(Objects.equals(s, ""))
            return 0;
        int i=0,a,c;
        long b=0;
        char d=' ';
        if(s.charAt(0)=='+'||s.charAt(0)=='-'){
            i++;
            d=s.charAt(0);
        }
        if((!Character.isDigit(s.charAt(0))&&s.length()==1)||!Character.isDigit(s.charAt(i)))
            return 0;

        while(i<=s.length()-1&&Character.isDigit(s.charAt(i))) {
            a = s.codePointAt(i) - 48;
            b = (b * 10) + a;
            if (d == '-' && b >= 2147483648L)
                return -2147483648;
            if(i==s.length()-1&&d=='-')
                return (int) -b;
            if (b >= 2147483647)
                return 2147483647;
            i++;
        }
        if(d=='-')
            return (int) -b;
        return (int) b;
    }
}
public class Medium8 {
    public static void main(String[] args) {
        String s="  -0012a42";
        Solution8 obj = new Solution8();
        System.out.println(obj.myAtoi(s));
    }
}