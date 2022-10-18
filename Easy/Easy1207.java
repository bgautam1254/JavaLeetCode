package LeetCode;
import java.util.Arrays;

class Solution1207 {
    public boolean uniqueOccurrences(int[] arr) {
        if(arr.length==1)
            return true;
        Arrays.sort(arr);
        int n = 1, k = 0;
        for (int i = 0; i <= arr.length - 2; i++) {
            if (arr[i] == arr[i + 1])
                n++;
            else {
                arr[k++] = n;
                n = 1;
            }
            if(i==arr.length-2)
                arr[k]=n;
        }
        Arrays.sort(arr, 0, k);
        for (int i = 0; i <= k - 1; i++)
            if (arr[i] == arr[i + 1])
                return false;
        return true;
    }
}

public class Easy1207 {
    public static void main(String[] args) {
        int[] a = {1, 2};
        Solution1207 obj = new Solution1207();
        System.out.println(obj.uniqueOccurrences(a));
    }
}