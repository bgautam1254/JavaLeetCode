package LeetCode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution658 {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>(k);
        int index = Arrays.binarySearch(arr, x);
        int i = 1, j = 0, a, b;
        if (index < 0)
            index = -index - 1;
        for (int l = 1; l <= k; l++) {
            if (index - i < 0) {
                list.add(arr[index + j++]);
                continue;
            } else if (index + j > arr.length - 1) {
                list.add(0, arr[index - i++]);
                continue;
            }
            a = Math.abs(x - arr[index - i]);
            b = Math.abs(x - arr[index + j]);
            if (a < b)
                list.add(0, arr[index - i++]);
            else if (a > b)
                list.add(arr[index + j++]);
            else
                list.add(0, arr[index - i++]);
        }
        return list;
    }
}

public class Medium658 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,6,6,7,7,9,9};
        int k = 8, x = 8;
        Solution658 obj = new Solution658();
        System.out.println(obj.findClosestElements(arr, k, x));
    }
}