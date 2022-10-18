package LeetCode;

class Solution383 {
    public boolean canConstruct(String ransomNote, String magazine) {
//        for (char i: ransomNote.toCharArray()) {
//            if (!magazine.contains(String.valueOf(i)))
//                return false;
//            else
//                magazine=magazine.replaceFirst(String.valueOf(i),"");
//        }
//        return true;

//        StringBuilder m=new StringBuilder(magazine);
//        for(int i=0;i<=ransomNote.length()-1;i++){
//            if(m.indexOf(String.valueOf(ransomNote.charAt(i)))>-1)
//                m.deleteCharAt(m.indexOf(String.valueOf(ransomNote.charAt(i))));
//            else return false;
//        }
//        return true;

        StringBuilder r=new StringBuilder(ransomNote);
        StringBuilder m=new StringBuilder(magazine);
        if(r.length()>m.length())
            return false;
        for(int i=0;i<=r.length()-1;i++){
            if(m.indexOf(String.valueOf(r.charAt(i)))>-1)
                m.deleteCharAt(m.indexOf(String.valueOf(r.charAt(i))));
            else return false;
        }
        return true;




    }
}

public class Easy383 {
    public static void main(String[] args) {
        String r = "c", m = "gabubtmc";
        Solution383 obj = new Solution383();
        System.out.println(obj.canConstruct(r,m));
    }
}