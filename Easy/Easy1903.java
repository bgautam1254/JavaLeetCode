package LeetCode;

class Solution1903 {
    public String largestOddNumber(String num) {
        int a,i;
        for (i = num.length() - 1; i >= 0; i--) {
            a=Integer.parseInt(String.valueOf(num.charAt(i)));
            if(a%2 !=0)
                return num.substring(0,i+1);
        }
        return "";

    }
}

public class Easy1903 {
    public static void main(String[] args) {
        String s = "1013389";
        Solution1903 obj = new Solution1903();
        System.out.println(obj.largestOddNumber(s));
    }
}
