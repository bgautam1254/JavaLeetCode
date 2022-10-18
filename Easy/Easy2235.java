package LeetCode;

class Solution2235 {
    public int sum(int num1, int num2) {
//        return Math.addExact(num1,num2);
        return num1 + num2;
    }
}

public class Easy2235 {
    public static void main(String[] args) {
        int n1 = 4, n2 = 6;
        Solution2235 obj=new Solution2235();
        System.out.println(obj.sum(n1,n2));
    }
}
