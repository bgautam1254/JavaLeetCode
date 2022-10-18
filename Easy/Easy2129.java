package LeetCode;

class Solution2129 {
    public String capitalizeTitle(String title) {
        StringBuilder tt= new StringBuilder();
        int k=0;
        while(title.indexOf(" ",k)>0){
            tt.append(appending(title.substring(k,title.indexOf(" ",k))));
            k=title.indexOf(" ",k)+1;
        }
        return tt.append(appending(title.substring(k))).toString().stripTrailing();
    }
    StringBuilder appending(String substring){
        if(substring.length()>2)
            return new StringBuilder().append(Character.toUpperCase(substring.charAt(0))).
                    append(substring.substring(1).toLowerCase()).append(" ");
        else
            return new StringBuilder().append(substring.toLowerCase()).append(" ");
    }
}

public class Easy2129 {
    public static void main(String[] args) {
//        String s="Fi2st5leTTeR12of EACH Word";
        String s="First leTTeR of EACH Word";
        Solution2129 obj = new Solution2129();
        System.out.println(obj.capitalizeTitle(s));
    }
}