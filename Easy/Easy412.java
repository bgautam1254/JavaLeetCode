package LeetCode;
import java.util.*;

class Solution412 {
    public List<String> fizzBuzz(int n) {
        List<String> ss = new ArrayList<>(n);
        for (int i = 0; i <= n-1; i++) {
            if ((i+1) % 3 != 0 && (i+1) % 5 != 0)
                ss.add(Integer.toString(i+1));
            else if ((i+1) % 3 == 0 && (i+1) % 5 != 0)
                ss.add( "Fizz");
            else if ((i+1) % 3 != 0 && (i+1) % 5 == 0)
                ss.add("Buzz");
            else ss.add("FizzBuzz");
        }
        return ss;
    }
}

public class Easy412 {
    public static void main(String[] args) {
        int n = 5;
        Solution412 obj = new Solution412();
        System.out.println(obj.fizzBuzz(n));
    }
}