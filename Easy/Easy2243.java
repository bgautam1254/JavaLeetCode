package LeetCode;

class Solution2243 {
    public String digitSum(String s, int k) {

        int n=0,sum=0;
        StringBuilder ss=new StringBuilder(s);
        StringBuilder sk=new StringBuilder();
        while(ss.length()>k) {
            for (int i = 0; i <= ss.length() - 1; i++) {
                sum += ss.charAt(i) - '0';
                n++;
                if (n == k || i == ss.length() - 1) {
                    sk.append(sum);
                    n = 0;
                    sum=0;
                    if (i == ss.length() - 1) {
                        ss = new StringBuilder(sk);
                        sk = new StringBuilder();
                    }
                }
            }
        }
        return String.valueOf(ss);
    }
}
public class Easy2243 {
    public static void main(String[] args) {
        String s="11111222223";
        int k=3;
        Solution2243 obj = new Solution2243();
            System.out.println(obj.digitSum(s,k));
    }
}
