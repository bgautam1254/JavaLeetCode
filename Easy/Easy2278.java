package LeetCode;

class Solution2278 {
    public int percentageLetter(String s, char letter) {
        int ans, max = s.length();
//        s=s.replaceAll(String.valueOf(letter),"");
        s = s.replace(letter, ' ').replace(" ", "");
        ans = ((max - s.length()) * 100) / max;
        return ans;
    }
}

public class Easy2278 {
    public static void main(String[] args) {
        String s = "kue";
        char l = 'e';
        Solution2278 obj = new Solution2278();
        System.out.println(obj.percentageLetter(s, l));
    }
}
