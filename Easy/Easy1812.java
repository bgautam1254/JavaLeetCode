package LeetCode;

class Solution1812 {
    public boolean squareIsWhite(String coordinates) {
        return coordinates.charAt(0) % 2 != coordinates.charAt(1) % 2;
    }
}

public class Easy1812 {
    public static void main(String[] args) {
        String s="asd";
        Solution1812 obj=new Solution1812();
        System.out.println(obj.squareIsWhite(s));
    }
}
