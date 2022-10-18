package LeetCode;

class Solution7 {
    public int reverse(int x) {

        int a = 0, b = 0, k;
        if (x < 0) {        //if x is negative then it convert to positve
            x = -x;
            b = 1;          //b=1 used to return negative value
        }
        while (x > 0) {
            k = x % 10;     //last digit
            if ((a == 214748364 && k > 7) || a > 214748364)     //checks if int is overflowing then return 0
                return 0;
            a = a * 10 + k;     //main logic
            x = x / 10;
        }
        if (b == 1) return -a;
        return a;

    }
}

public class Medium7 {
    public static void main(String[] args) {
//        int x = 2147483646;
        Solution7 obj = new Solution7();
        System.out.println(obj.reverse(1234567890));
    }
}
//1056389759