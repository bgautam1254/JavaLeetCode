package LeetCode;

class Solution520 {
    public boolean detectCapitalUse(String word) {
        int i = 2;
        if (Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))) {
            while (i < word.length())
                if (Character.isLowerCase(word.charAt(i++)))
                    return false;
        } else if (Character.isUpperCase(word.charAt(0)) && Character.isLowerCase(word.charAt(1))) {
            while (i < word.length())
                if (Character.isUpperCase(word.charAt(i++)))
                    return false;
        } else if (Character.isLowerCase(word.charAt(0)) && Character.isLowerCase(word.charAt(1))) {
            while (i < word.length())
                if (Character.isUpperCase(word.charAt(i++)))
                    return false;
        }
        else return false;
        return true;
    }
}

public class Easy520 {
    public static void main(String[] args) {
        String word = "sA";
        Solution520 obj = new Solution520();
        System.out.println(obj.detectCapitalUse(word));
    }
}
