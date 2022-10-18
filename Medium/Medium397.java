package LeetCode;
class Solution397 {
    public int integerReplacement(int n) {
        int count = 0;
        if (n == 2147483647) {
            n = 1073741824;
            count = 2;
        }
        while (n != 1) {
            if (n == 3 || n % 2 == 1 && (n - 1) % 4 == 0)
                n -= 1;
            else if (n % 2 == 1)
                n += 1;
            else
                n /=2;
            count++;
        }
        return count;
    }
}

public class Medium397 {
    public static void main(String[] args) {
        System.out.println(2147483647 / 2);
        int n = 2147483647;
        Solution397 obj = new Solution397();
        System.out.println(obj.integerReplacement(n));
    }
}