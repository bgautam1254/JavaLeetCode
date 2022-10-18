package LeetCode;

class Solution2000 {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb=new StringBuilder(word.substring(0,word.indexOf(String.valueOf(ch))+1)).reverse();
        return sb.append(word.substring(word.indexOf(String.valueOf(ch))+1)).toString();
    }
}
public class Easy2000 {
    public static void main(String[] args) {
        String s= "abcdefd";
        char ch = 'd';
        Solution2000 obj= new Solution2000();
        System.out.println(obj.reversePrefix(s,ch));
    }
}
