package LeetCode;

class Solution278 {
    public int firstBadVersion(int n) {
        int s=0,m;
        m=(s+((n-s)/2));
        while (s<=m) {
            m = s + ((n - s) / 2);
            if (4<m)
                n = m - 1;
            else
                s = m + 1;
        }
        return s;
    }
}

public class Easy278 {
    public static void main(String[] args) {
        int n=15;
        Solution278 obj = new Solution278();
        System.out.println(obj.firstBadVersion(n));
    }
}
