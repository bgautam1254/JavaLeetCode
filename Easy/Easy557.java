package LeetCode;

class Solution557 {
    public String reverseWords(String s) {
//        StringBuilder s1, s2 = new StringBuilder();
//        int i, a;
//
//        for (i = 0; i <= s.length() - 1; i++) {
//            a = s.indexOf(" ", i);
//            if(a<0)
//                return s2.append(s).reverse().toString();
//            s1= new StringBuilder(s.substring(i, a));
//            s2.append(s1.reverse()).append(" ");
//
//            if (a == s.lastIndexOf(" ")) {
//                s1= new StringBuilder(s.substring(a+1));
//                s2.append(s1.reverse());
//                break;
//            }
//            i = a;
//        }
//        return s2.toString();

//        String[] ss=s.split(" ");
//        StringBuilder s2 = new StringBuilder();
//        for (int i=0;i<=ss.length-1;i++)
//            s2.append(new StringBuilder(ss[i]).reverse()).append(" ");
//        return s2.deleteCharAt(s.length()).toString();

        String[] ss=s.split(" ");



        StringBuilder s2 = new StringBuilder();
        for (int i=0;i<=ss.length-1;i++)
            s2.append(new StringBuilder(ss[i]).reverse()).append(" ");
        return s2.deleteCharAt(s.length()).toString();
    }
}

public class Easy557 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        Solution557 obj = new Solution557();
        System.out.println(obj.reverseWords(s));
    }
}
