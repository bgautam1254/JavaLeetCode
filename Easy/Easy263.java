package LeetCode;

class Solution263 {
    public boolean isUgly(int n) {
//        if (n < 1) return false;
//        while (n != 1) {
//            if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0) {
//                if (n % 2 == 0) n = n / 2;
//                else if (n % 3 == 0) n = n / 3;
//                else if (n % 5 == 0) n = n / 5;
//            } else return false;
//        }
//        return true;

        if (n < 1) return false;
        while (n % 2 == 0) n = n / 2;
        while (n % 3 == 0) n = n / 3;
        while (n % 5 == 0) n = n / 5;
        return n == 1;

    }
}

public class Easy263 {
    public static void main(String[] args) {
        int n = 27;
        Solution263 obj = new Solution263();
        System.out.println(obj.isUgly(n));
    }
}
