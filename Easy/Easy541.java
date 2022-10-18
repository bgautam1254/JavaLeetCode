package LeetCode;

class Solution541 {
    public String reverseStr(String s, int k) {

        int m=(2*k)-(s.length()%(2*k));
        s=String.format("%"+(-s.length()-m)+"s",s);

        StringBuilder sm;
        StringBuilder sk = new StringBuilder(s);
        StringBuilder ss = new StringBuilder();
        for(int i=0;i<=s.length()-1;i++){
            sm = new StringBuilder(sk.substring(i, i + k));
            sm.reverse();
            ss.append(sm).append(sk.substring(i+k,i+(2*k)));
            i +=(2*k)-1;
        }
        return String.valueOf(ss).trim().replaceAll(" ","");
    }
}
public class Easy541 {
    public static void main(String[] args) {
        String s="abcdefghijkl";
        int k=3;
        Solution541 obj=new Solution541();
        System.out.println(obj.reverseStr(s,k));
    }
}
