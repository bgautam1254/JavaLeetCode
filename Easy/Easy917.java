package LeetCode;

class Solution917 {
    public String reverseOnlyLetters(String s) {
        StringBuilder ss= new StringBuilder(s.replaceAll("[^a-zA-Z]","")).reverse();
        for(int i=0;i<=s.length()-1;i++)
            if(!Character.isLetter(s.charAt(i)))
                ss.insert(i,s.charAt(i));
        return String.valueOf(ss);
    }
}
public class Easy917 {
    public static void main(String[] args) {
        String s="Test1ng-Leet=code-Q!";
        Solution917 obj=new Solution917();
        System.out.println(obj.reverseOnlyLetters(s));
    }
}
