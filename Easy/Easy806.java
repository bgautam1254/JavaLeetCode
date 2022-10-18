package LeetCode;
import java.util.Arrays;

class Solution806 {
    public int[] numberOfLines(int[] widths, String s) {

        int a,sum=0,l=0;
        int[] result = new int[2];

        for(int i=0; i<=s.length()-1; i++ ) {
            sum +=widths[s.codePointAt(i)-97];
            if(sum>100) {
                sum=0;
                l++;
                i--;
            }
        }

        result[0]=l+1;
        result[1]=sum;

        return result;
    }
}

public class Easy806 {
    public static void main(String[] args) {
        String s = "bbbcccdddaaa";
        int[] w = {4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        Solution806 obj = new Solution806();
        System.out.println(Arrays.toString(obj.numberOfLines(w, s)));
    }
}
