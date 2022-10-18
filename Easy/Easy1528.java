package LeetCode;

class Solution1528 {
    public String restoreString(String s, int[] indices) {
        int i,j=0,l=s.length()-1;
        String k="";
        for(i=0;i<=l;i++){
            if(indices[i]==j){
                k +=s.charAt(i);
                j++;
                i=-1;
                if(j>l)
                    break;
            }
        }
        return k;
    }
}

public class Easy1528 {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        Solution1528 obj = new Solution1528();
        System.out.println(obj.restoreString(s, indices));
    }
}
