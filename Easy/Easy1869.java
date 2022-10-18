package LeetCode;

class Solution1869 {
    public boolean checkZeroOnes(String s) {
        int a = 0, b = 0, k = 0, l = 0;
        for (int i:s.toCharArray()) {
            if (i == '1') {
                b=0;
                if (++a > k)
                    k = a;
            }
            else {
                a=0;
                if (++b > l)
                    l = b;
            }
        }
        return k>l;
    }
}

public class Easy1869 {
    public static void main(String[] args) {
        String s = "1101000111110";
        Solution1869 obj = new Solution1869();
        System.out.println(obj.checkZeroOnes(s));
    }
}
