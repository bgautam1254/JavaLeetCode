package LeetCode;

import java.util.HashSet;

class Solution202 {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();

        while (n != 1) {
            if (!set.contains(n))
                set.add(n);
            else
                return false;

            int sum = 0;
            while (n != 0) {
                sum += (n % 10) * (n % 10);
                n = n / 10;
            }
            n = sum;
        }

        return true;

    }
}

public class Easy202 {
    public static void main(String[] args) {
        int a = 19;
        Solution202 obj = new Solution202();
        System.out.println(obj.isHappy(a));
    }
}