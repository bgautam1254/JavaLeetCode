package LeetCode;

import java.util.Arrays;

class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        char a, b, c;
        String result = "";

        for (int j = 0; j <= strs[0].length(); j++) {
            a = strs[0].charAt(j);
            b = strs[1].charAt(j);
            c = strs[2].charAt(j);

            if (a == b && b == c)
                result += a;

            else {
                result += "";
                break;
            }

        }
        result= "\""+result+"\"";
        System.out.println(result);
        return result;
    }





    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flowight","flowt"};
        Arrays.sort(str);
        System.out.println(Math.min(str[0].length(),str[str.length-1].length()));

        Solution14 obj = new Solution14();
//        System.out.print(obj.longestCommonPrefix(str));
    }
}