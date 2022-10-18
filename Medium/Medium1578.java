package LeetCode;

import java.util.Arrays;

class Solution1578 {
    public int minCost(String colors, int[] neededTime) {
//        char[] c = colors.toCharArray();
//        int a = 0, b = -1, count = 0;
//        for (int i = 1; i <= c.length - 1; i++) {
//            if (c[i] == c[i - 1] && i == c.length - 1) {
//                a++;
//                b = i + 1;
//            }
//            else if (c[i] == c[i - 1])
//                a++;
//            else if (c[i] != c[i - 1])
//                b = i;
//            if (a == 0 && b != -1)
//                b = -1;
//            else if (a != 0 && b != -1) {
//                Arrays.sort(neededTime, b - a - 1, b);
//                for (int j = b - a - 1; j <= b - 2; j++)
//                    count = count + neededTime[j];
//                a = 0;
//                b = -1;
//            }
//        }
//        return count;
        int count = 0, k = -1;
        char[] c = colors.toCharArray();
        for (int i = 1; i <= c.length - 1; i++) {
            if (c[i] == c[i - 1]) {
                if (neededTime[i] <= neededTime[i - 1]) {
                    count = count + neededTime[i];
                    neededTime[i] = k--;
                }
                else {
                    count = count + neededTime[i - 1];
                    neededTime[i - 1] = k--;
                }
            }
        }
        return count;
    }
}

public class Medium1578 {
    public static void main(String[] args) {
        String s = "bbbaaa";
        int[] a = {4,9,3,8,8,9};
        Solution1578 obj = new Solution1578();
        System.out.println(obj.minCost(s, a));
    }
}
