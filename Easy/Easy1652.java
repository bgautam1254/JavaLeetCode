package LeetCode;
import java.util.Arrays;

class Solution1652 {
    public int[] decrypt(int[] code, int k) {
        int[] co = new int[code.length];
        int sum = 0;

        if (k > 0) {
            for (int i = 0; i <= k - 1; i++)
                sum += code[i];
            for (int i = 0; i <= code.length - 1; i++) {
                sum = sum - code[i] + code[k];
                co[i] = sum;
                k++;
                if (k == code.length)
                    k = 0;
            }
        }
        else if(k<0) {
            for (int i = code.length - 1; i >= code.length + k; i--)
                sum += code[i];
             for (int i = code.length - 1; i >= 0; i--) {
                sum = sum - code[i] + code[code.length - 1 + k];
                co[i] = sum;
                k--;
                if (code.length - 1 + k==-1)
                    k = 0;
            }
        }
        return co;
    }
}

public class Easy1652 {
    public static void main(String[] args) {
        int[] code = {2,4,9,3};
        int k = -2;
        Solution1652 obj = new Solution1652();
        System.out.println(Arrays.toString(obj.decrypt(code, k)));
    }
}
