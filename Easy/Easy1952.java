package LeetCode;

class Solution1952 {
    public boolean isThree(int n) {
        if (n < 4 || (n > 4 && n % 2 == 0) || (int) Math.sqrt(n) * (int) Math.sqrt(n) <n)
            return false;
        else {
            for (int i = 3; i <= Math.sqrt((int) Math.sqrt(n)); i += 2)
                if (n % i == 0)
                    return false;
            return true;
        }
    }
}

public class Easy1952 {
    public static void main(String[] args) {
        int n = 4;
        Solution1952 obj = new Solution1952();
        System.out.println(obj.isThree(n));
    }
}