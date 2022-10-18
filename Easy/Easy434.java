package LeetCode;

class Solution434 {
    public int countSegments(String s) {
//        s = s.trim();
//        int n = 0;
//        if(s.length()==0)
//            return 0;
//        else if (s.length()==1)
//            return 1;
//
//        for (int i = 0; i <= s.length() - 2; i++)
//            if ((s.charAt(i) == ' ') && s.charAt(i+1)!=' ' && (i > 0))
//                n++;
//
//        return ++n;


        int k=0;
        String[] a = s.split(" ");
        for (String asd : a)
            if(!asd.equals(""))
                k++;
        return k;
    }
}

public class Easy434 {
    public static void main(String[] args) {
//        String s = "bharatss@for@gautamss";
//        String[] art1 = str22.split("@");
//        for (String asd : art1)
//            System.out.println(asd);
//
        String s="v     ";
        Solution434 obj = new Solution434();
        System.out.println(obj.countSegments(s));
    }
}