package LeetCode;

class Solution657 {
    public boolean judgeCircle(String moves) {
//        int x = 0, y = 0;
//        for (int i = 0; i <= moves.length() - 1; i++) {
//            if (moves.charAt(i) == 'R') x += 1;
//            else if (moves.charAt(i) == 'L') x += -1;
//            else if (moves.charAt(i) == 'U') y += 1;
//            else if (moves.charAt(i) == 'D') y += -1;
//        }
//        return x == 0 && y == 0;

        int x = 0, y = 0;
        for (char i: moves.toCharArray()) {
            if (i== 'R') x++;
            else if (i == 'L') x--;
            else if (i == 'U') y++;
            else if (i == 'D') y--;
        }
        return x == 0 && y == 0;
    }
}

public class Easy657 {
    public static void main(String[] args) {
        String s = "rlud";
        Solution657 obj = new Solution657();
        System.out.println(obj.judgeCircle(s));
    }
}
