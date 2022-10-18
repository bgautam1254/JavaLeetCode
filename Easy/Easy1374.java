package LeetCode;
class Solution1374 {
    public String generateTheString(int n) {
//        if(n%2==0)
//            return "a".repeat(n-1)+"b";
//        else
//            return "a".repeat(n);

//        StringBuilder ss=new StringBuilder();
//        int i=0;
//        while(i!=n) {
//            ss.append("a");
//            i++;
//        }
//        if(n%2==1)
//            return String.valueOf(ss);
//        else return String.valueOf(ss.delete(0,1).append("b"));

//        StringBuilder ss=new StringBuilder();
//        int i=0;
//        if(n%2==0) {
//            while (i != n-1) {
//                ss.append("a");
//                i++;
//            }
//            ss.append("b");
//        }
//        else {
//            while (i != n) {
//                ss.append("a");
//                i++;
//            }
//        }
//        return String.valueOf(ss);

        StringBuilder ss=new StringBuilder();
        int i=0,a=n;
        if(n%2==0)
            a=n-1;
        while (i != a) {
            ss.append("a");
            i++;
        }
        if(n%2==0)
            return String.valueOf(ss.append("b"));
        return String.valueOf(ss.toString());
    }
}
public class Easy1374 {
    public static void main(String[] args) {
        int n=11;
        Solution1374 obj = new Solution1374();
        System.out.println(obj.generateTheString(n));
    }
}
