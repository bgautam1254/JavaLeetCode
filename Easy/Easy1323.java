package LeetCode;

class Solution1323 {
    public int maximum69Number(int num) {
//        return Integer.parseInt(Integer.toString(num).replaceFirst("6","9"));

        int m = 3, a = 0, n = num;
        while (n > 5) {
            if (n % 10 == 6)
                a = m;
            m *= 10;
            n /= 10;
        }
        if (a >= 3)
            return num + a;
        return num;
    }
}

public class Easy1323 {
    public static void main(String[] args) {
        int a = 6;
        Solution1323 obj = new Solution1323();
        System.out.println(obj.maximum69Number(a));
    }
}
