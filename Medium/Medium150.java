package LeetCode;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Solution150 {
    public int evalRPN(String[] tokens) {
        List<Integer> ss = new ArrayList<>();
        for (int i = 0; i <= tokens.length - 1; i++) {
            if (Objects.equals(tokens[i], "+") || Objects.equals(tokens[i], "-") || Objects.equals(tokens[i], "*") || Objects.equals(tokens[i], "/")) {
                int a=ss.get(ss.size() - 2),b=ss.get(ss.size() - 1);
                if (Objects.equals(tokens[i], "+"))
                    tokens[a] = String.valueOf(Integer.parseInt(tokens[a]) + Integer.parseInt(tokens[b]));
                else if (Objects.equals(tokens[i], "-"))
                    tokens[a] = String.valueOf(Integer.parseInt(tokens[a]) - Integer.parseInt(tokens[b]));
                else if (Objects.equals(tokens[i], "*"))
                    tokens[a] = String.valueOf(Integer.parseInt(tokens[a]) * Integer.parseInt(tokens[b]));
                else if (Objects.equals(tokens[i], "/"))
                    tokens[a] = String.valueOf(Integer.parseInt(tokens[a]) / Integer.parseInt(tokens[b]));
                tokens[i] = ".";
                tokens[ss.get(ss.size() - 1)] = ".";
                ss.remove(ss.size() - 1);
            }
            else
                ss.add(i);      //in list ss i am adding index of the integer value
        }
        return Integer.parseInt(tokens[0]);
    }
}

public class Medium150 {
    public static void main(String[] args) {
        String[] tokens = new String[]{"2","1","+","3","*"};
        Solution150 obj = new Solution150();
        System.out.println(obj.evalRPN(tokens));
    }
}