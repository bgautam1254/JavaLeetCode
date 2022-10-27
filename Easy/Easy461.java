package LeetCode;

class Solution461 {
    public int hammingDistance(int x, int y) {
//        return Integer.bitCount(x ^ y);

        int count = 0;
        while (x != 0 || y != 0) {
            if ((x & 1) != (y & 1))
                count++;
            y >>= 1;
            x >>= 1;
        }
        return count;

    }
}

public class Easy461 {
    public static void main(String[] args) {
        int x = 1, y = 4;
        Solution461 obj = new Solution461();
        System.out.println(obj.hammingDistance(x, y));
    }
}
