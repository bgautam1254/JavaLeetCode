package LeetCode;
import java.util.Arrays;
import java.util.stream.Collectors;

class Solution1662 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
//        return String.join("", word1).equals(String.join("", word2));
        return Arrays.stream(word1).collect(Collectors.joining()).equals(Arrays.stream(word2).collect(Collectors.joining()));
    }
}

public class Easy1662 {
    public static void main(String[] args) {
        String[] a = {"abc", "d", "defg"};
        String[] b = {"abcddefg"};
        Solution1662 obj = new Solution1662();
        System.out.println(obj.arrayStringsAreEqual(a, b));
    }
}
