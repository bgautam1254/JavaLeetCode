package LeetCode;
import java.util.Arrays;

class Solution67 {
    public String addBinary(String a, String b) {

        int l1 = a.length(), l2 = b.length(), i;
        String temp = "0";

        if (l1 > l2) {
            a = "0" + a;
            for (i = 1; i <= l1 - l2 + 1; i++)
                b = "0" + b;
        }
        else if (l1 < l2) {
            b = "0" + b;
            for (i = 1; i <= l2 - l1 + 1; i++)
                a = "0" + a;
        }
        else {
            a = "0" + a;
            b = "0" + b;
        }

        String[] a1 = a.split("");
        String[] a2 = b.split("");

        l1 = a1.length;
        String[] c = new String[l1];

        for (i = l1-1; i >= 0; i--) {
            if (((("1".equals(a1[i])) && ("0".equals(a2[i])))|| (("0".equals(a1[i])) && ("1".equals(a2[i])))) && ("0".equals(temp))) {
                c[i] = "1";
                temp = "0";
            }
            else if (((("1".equals(a1[i]) && "0".equals(a2[i])) || ("0".equals(a1[i]) && "1".equals(a2[i])))) && ("1".equals(temp))) {
                c[i] = "0";
                temp = "1";
            }
            else if (("0".equals(a1[i]) && "0".equals(a2[i])) && "0".equals(temp)) {
                c[i] = "0";
                temp = "0";
            }
            else if ("0".equals(a1[i]) && "0".equals(a2[i]) && "1".equals(temp)) {
                c[i] = "1";
                temp = "0";
            }
            else if ("1".equals(a1[i]) && "1".equals(a2[i]) && "0".equals(temp)) {
                c[i] = "0";
                temp = "1";
            }
            else if ("1".equals(a1[i]) && "1".equals(a2[i]) && "1".equals(temp)) {
                c[i] = "1";
                temp = "1";
            }
        }

        a = Arrays.toString(c);
        a = a.replace("[", "").replace("]", "").replace(",", "").replace(" ", "");
        if(a.charAt(0)=='0')
                a = a.substring(0, 0) + "" + a.substring(0+1);
        return a;
    }
}

public class Easy67 {
    public static void main(String[] args) {

        String a = "1";
        String b = "111";

        System.out.println(a + "\n" + b);
        Solution67 obj = new Solution67();
        System.out.println(obj.addBinary(a, b));


    }
}
