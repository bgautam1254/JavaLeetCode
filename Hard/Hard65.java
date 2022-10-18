package LeetCode;

class Solution65 {
    public boolean isNumber(String s) {
        if(s.matches("[+-]?[.][eE][0-9]+"))
            return false;
        if(s.matches("[+-]?[0-9]+"))
            return true;
        if(s.matches("[+-]?[0-9]+[.][0-9]*"))
            return true;
        if(s.matches("[+-]?[.][0-9]+"))
            return true;
        if(s.matches("[+-]?[0-9]+[eE][+-]?[0-9]+"))
            return true;
        if(s.matches("[+-]?[0-9]+[.][0-9]*[eE][+-]?[0-9]+"))
            return true;
        if(s.matches("[+-]?[.][0-9]+[eE][+-]?[0-9]+"))
            return true;
        else
            return false;
    }
}
public class Hard65 {
    public static void main(String[] args) {
        String s="";
        Solution65 obj = new Solution65();
        System.out.println(obj.isNumber(s));
    }
}
