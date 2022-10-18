package LeetCode;

class Solution125 {
    public boolean isPalindrome(String s) {

//        String sb, k=s.toLowerCase().replaceAll("[^a-z0-9]","");
//        StringBuilder ss= new StringBuilder(k);
//        ss.reverse();
//        sb=ss.toString();
//        return k.equals(sb);

//        StringBuilder ss= new StringBuilder(s.toLowerCase().replaceAll("[^a-z0-9]",""));
//        StringBuilder sb= new StringBuilder(ss);
//        return ss.toString().equals(sb.reverse().toString());

//        s=s.toLowerCase().replaceAll("[^a-z0-9]","");
//        for (int i = 0; i < s.length() / 2; i++)
//            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
//                return false;
//        return true;

        int i = 0, j = s.length() - 1;
        char c = ' ';

        while (i < j) {

            while (i < j) {
                if (Character.isLetterOrDigit(s.charAt(i))) {
                    c=Character.toLowerCase(s.charAt(i));
                    break;
                }
                i++;
            }

            while (i < j) {
                if (Character.isLetterOrDigit(s.charAt(j))) {
                    if (c != Character.toLowerCase(s.charAt(j)))
                        return false;
                    else {
                        i++;
                        j--;
                        break;
                    }
                }
                j--;
            }

        }
        return true;
    }
}

public class Easy125 {
    public static void main(String[] args) {
//        String s = "A, 00a";
        String s = "A man, a plan, a canal: Panama";
//        String s = "race a car";
//        String s = " ";
//        String s = "0P";
        Solution125 obj = new Solution125();
        System.out.println(obj.isPalindrome(s));
        String a = "race a car";
        System.out.println(obj.isPalindrome(a));
    }
}