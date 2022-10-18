package LeetCode;

class Solution1417 {
    public String reformat(String s) {

//        StringBuilder ss = new StringBuilder(s.replaceAll("[a-z]", ""));
//        StringBuilder sm = new StringBuilder(s.replaceAll("[0-9]", ""));
//        StringBuilder sk = new StringBuilder();
//
//        int an = ss.length();
//        int bs = sm.length();
//
//        if (an == bs + 1)
//            for (int i = 0; i <= an - 1; i++) {
//                sk.append(ss.charAt(i));
//                if (i != an - 1)
//                    sk.append(sm.charAt(i));
//            }
//
//        else if (bs == an + 1)
//            for (int i = 0; i <= bs - 1; i++) {
//                sk.append(sm.charAt(i));
//                if (i != bs - 1)
//                    sk.append(ss.charAt(i));
//            }
//
//        else if (an == bs)
//            for (int i = 0; i <= an - 1; i++)
//                sk.append(ss.charAt(i)).append(sm.charAt(i));
//
//        else return "";
//
//        return String.valueOf(sk);


        String num=s.replaceAll("[^a-z]","");
        String str=s.replaceAll("[^0-9]","");
        StringBuilder c= new StringBuilder();
        int an = num.length();
        int bs = str.length();

        if (an == bs + 1)
            for (int i = 0; i <= an - 1; i++) {
                c.append(num.charAt(i));
                if (i != an - 1)
                    c.append(str.charAt(i));
            }

        else if (bs == an + 1)
            for (int i = 0; i <= bs - 1; i++) {
                c.append(str.charAt(i));
                if (i != bs - 1)
                    c.append(num.charAt(i));
            }

        else if (an == bs)
            for (int i = 0; i <= an - 1; i++)
                c.append(num.charAt(i)).append(str.charAt(i));

        else return "";

        return c.toString();
    }
}

public class Easy1417 {
    public static void main(String[] args) {
        String a = "abc12345";
        Solution1417 obj = new Solution1417();
        System.out.println(obj.reformat(a));
    }
}
